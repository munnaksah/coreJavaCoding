package com.org.kodewala.ecommerce.jdbc.entities;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int stock;

	public Product(int productId, String productName, double price, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public boolean equals(Object obj) {
		Product product = (Product) obj;
		return this.productId == product.productId;
	}

	@Override
	public int hashCode() {
		return this.productId;
	}

}
