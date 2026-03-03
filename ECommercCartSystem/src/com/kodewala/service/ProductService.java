package com.kodewala.service;


import java.util.*;
import java.util.stream.Collectors;

import com.kodewala.model.Product;

public class ProductService {
	
	



	     List<Product> products = new ArrayList<>();
	     
	   

	    public void loadProducts() {
	        addProduct(new Product(1, "Laptop", 60000, 10));
	        addProduct(new Product(2, "Mobile", 20000, 15));
	        addProduct(new Product(3, "Headphones", 2000, 20));
	        addProduct(new Product(4, "Keyboard", 1500, 25));
	        addProduct(new Product(5, "mouse", 600, 10));
	        addProduct(new Product(6, "earphone", 200, 15));
	        addProduct(new Product(7, "motherboard", 5000, 20));
	        addProduct(new Product(8, "desktop", 15000, 25));
	    }

	    public void addProduct(Product product) {
	        boolean exists = products.stream()
	                .anyMatch(p -> p.getId() == product.getId());

	        if (!exists) {
	            products.add(product);
	        } else {
	            System.out.println("Duplicate Product ID not allowed!");
	        }
	    }

	    public void displayProducts() {
	        products.forEach(System.out::println);
	    }

	    public List<Product> searchByName(String name) {
	        return products.stream()
	                .filter(p -> p.getName().equalsIgnoreCase(name))
	                .collect(Collectors.toList());
	    }

//	    public void sortByPrice(boolean ascending) {
////	        Comparator<Product> comparator =
////	                Comparator.comparing(Product::getPrice);
////
////	        if (!ascending)
////	            comparator = comparator.reversed();
////
////	        products.sort(comparator);
//	    	
//	    	
//	    }
	    
	 // method to sort products by price(ascending)
		public List<Product> sortByPriceAscending(){
			return products.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
		}
		
		// // method to sort products by price(Descending)
		public List<Product> sortByPriceDescending(){
			return products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toList());
		}
	    public Product getProductById(int id) {
	        return products.stream()
	                .filter(p -> p.getId() == id)
	                .findFirst()
	                .orElse(null);
	        
	        
	    
	    }
	}

	
	


