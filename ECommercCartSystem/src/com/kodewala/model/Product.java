package com.kodewala.model;

import java.util.Objects;

//encapsulation use here 
public class Product {
// : id (int), name (String), price (double), stock (int)
	 private int id;
	 private String name;
	 private double price;
	 private int stock;
	 
	 public Product(int id, String name, double price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
	// equals & hashCode based on id (important for HashMap)
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Product)) return false;
//        Product product = (Product) obj;
//        return id == product.id;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//  
    @Override
    public String toString() {
        return id + " | " + name + " | ₹" + price + " | Stock: " + stock;
    }
	
	 

}
