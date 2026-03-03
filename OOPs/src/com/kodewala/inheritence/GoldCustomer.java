package com.kodewala.inheritence;

class Customer{
	public void buyProduct(String productName) {
		System.out.println("customer.buyProduct(). buying product..");
	}
	
}

public class GoldCustomer extends Customer  {
	
	// (is-a) customer class is parent class and goldCustomer is chillclass
	//
	public void dosSomething() {
		GoldCustomer cust = new GoldCustomer();
		cust.buyProduct("pizza");
		cust.hashCode();
		cust.toString();
		
		
				
	}
   
}
