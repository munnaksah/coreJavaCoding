package com.kodewala.inte;


interface PaymentT{
	// variables must be constant 
	public static final int MAX = 100;
	
	// method always by default public  and abstract 
	public abstract void pay();
	
	void stopPayment();
	
}


class SBIBank implements PaymentT{
	
	public void pay() {
		
	}
	
	public void stopPayment() {
		
	}
	
}

public class Driver1 {

}
