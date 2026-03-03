package com.kodewala.service;

import java.util.HashMap;
import java.util.Map;

import com.kodewala.model.Product;

public class CartService {

	Map<Product, Integer> cart = new HashMap<>();

	public void addToCart(Product product, int quantity) {

		if (product.getStock() < quantity) {
			System.out.println("Insuficiant stock ");

		}
		cart.put(product, cart.getOrDefault(product, 0) + quantity);
		System.out.println("Successfully Added to cart");

	}

	public void removeFromCart(Product product) {
		if (cart.containsKey(product)) {
			cart.remove(product);
			System.out.println("remove from cart");

		}

	}

	public void updateQuantity(Product product, int quantity) {

		if (!cart.containsKey(product)) {

			System.out.println(" product not avaible in the cart");
		}
		if (quantity <= 0) {
			cart.remove(product);

		} else {
			cart.put(product, quantity);
		}
		System.out.println("Quantity updated");

	}

	public void viewCart() {
		if (cart.isEmpty()) {
			System.out.println("cart is Empty or nothing is here");

		}

		cart.forEach((product, qty) -> System.out
				.println(product.getName() + " QTy " + qty + "| price " + product.getPrice() * qty));
		
		System.out.println("Total:  price  " + calculateTotal());

	}

	public double calculateTotal() {
		return cart.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();

	}

	public Map<Product, Integer> getCart() {
		return cart;

	}

	public void cleanCart() {
		cart.clear();
	}

	

}
