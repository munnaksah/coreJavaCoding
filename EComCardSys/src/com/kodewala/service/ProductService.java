package com.kodewala.service;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.kodewala.model.Product;

public class ProductService {

	List<Product> products = new ArrayList<>();

	// Load Default Products
	public void loadProducts() {

		products.add(new Product(1, "Laptop", 60000, 10));
		products.add(new Product(2, "Mobile", 20000, 15));
		products.add(new Product(3, "Headphones", 2000, 20));
		products.add(new Product(4, "Keyboard", 1500, 25));
		products.add(new Product(5, "Mouse", 600, 10));
		products.add(new Product(6, "Earphone", 200, 15));
		products.add(new Product(7, "Motherboard", 5000, 20));
		products.add(new Product(8, "Desktop", 15000, 25));
	}

	// Add Product
	public void addProduct(Product product) {

		for (Product p : products) {
			if (p.getId() == product.getId()) {
				System.out.println("Duplicate Product ID not allowed");

			}
		}

		products.add(product);
		System.out.println("Product added successfully!");
	}

	// Display All Products
	public void displayProducts() {

		for (Product p : products) {
			System.out.println(p);
		}
		if (products.isEmpty()) {
			System.out.println("No products available here. ");

		}

	}

	// search Product By Name
	public List<Product> searchByName(String name) {

		List<Product> result = new ArrayList<>();

		for (Product p : products) {
			if (p.getName().equalsIgnoreCase(name)) {
				result.add(p);
			}
		}

		return result;
	}

	// method to sort products by price(ascending)
	public List<Product> sortByPriceAscending() {
		return products.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
	}

	// // method to sort products by price(Descending)
	public List<Product> sortByPriceDescending() {
		return products.stream().sorted(Comparator.comparing(Product::getPrice).reversed())
				.collect(Collectors.toList());
	}

	// Get Product By ID
	public Product getProductById(int id) {

		for (Product p : products) {
			if (p.getId() == id) {
				return p;
			}
		}

		return null;
	}
}
