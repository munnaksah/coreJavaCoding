package com.org.kodewala.ecommerce.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.org.kodewala.ecommerce.jdbc.entities.Product;
import com.org.kodewala.ecommerce.jdbc.exception.ProductNotFoundException;

public class ProductService {
	public List<Product> getProductsFromDatabase(Connection connection) {
		List<Product> products = new ArrayList<Product>();
		try {
			String query = "Select * from products";
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String productName = resultSet.getString(2);
				double price = resultSet.getDouble(3);
				int stock = resultSet.getInt(4);

				Product product = new Product(id, productName, price, stock);
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	public Product getProductById(List<Product> products, int productId) throws ProductNotFoundException {
		Product product = products.stream().filter(pro -> pro.getProductId() == productId).findFirst().orElse(null);
		if (product == null) {
			throw new ProductNotFoundException("Product not found,please try again");
		} else {
			return product;
		}
	}

	public void findProductByKeyWord(List<Product> products, String keyWord) {
		products = products.stream().filter(n -> n.getProductName().toLowerCase().contains(keyWord.toLowerCase()))
				.toList();
		if (products.isEmpty()) {
			System.out.println("No products found!!");
		} else {
			printProductList(products);
		}
	}

	public void sortProducts(List<Product> products, boolean asc) {
		if (asc) {
			products = products.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
		} else {
			products = products.stream().sorted(Comparator.comparing(Product::getPrice).reversed())
					.collect(Collectors.toList());
		}
		printProductList(products);
	}

	public void printProductList(List<Product> products) {
	    System.out.println("\n===============================================================");
	    System.out.println("                        PRODUCT CATALOG                        ");
	    System.out.println("===============================================================");
	    
	    System.out.printf("%-10s | %-25s | %-10s | %-10s%n", "Product ID", "Product Name", "In Stock", "Price");
	    System.out.println("---------------------------------------------------------------");

	    for (Product product : products) {
	        System.out.printf("%-10d | %-25s | %-10d | $%-9.2f%n", 
	                          product.getProductId(), 
	                          product.getProductName(), 
	                          product.getStock(), 
	                          product.getPrice());
	    }
	    
	    System.out.println("===============================================================\n");
	}
}
