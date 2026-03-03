package com.kodewala.inte;

interface Payment{  // an interface (before java 8)
	// variable+ methods
	
	public abstract void pay();  // what to do
	
	
	public abstract void stopPayment();
}



class Bank implements Payment{
	@Override
	public void pay() {  // how to do
		System.out.println("anything can print here, implemention    method");
		
	}
	@Override
	public void stopPayment() {
		
	}
	
}

public class Driver {

}
