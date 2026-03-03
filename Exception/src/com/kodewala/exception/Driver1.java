package com.kodewala.exception;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println(" give the amount");
		
		int  amount = 100;
		try {
		int result = amount/0;
		System.out.println(result);
		} catch( ArithmeticException e) {
			System.err.println("ArithmeticException... ");
			 
		}
		
		System.out.println(" End  with this method");
		
	}

}
