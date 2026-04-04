package com.kodewala.exception;

public class Driver4 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.kodewala.driver4"); // checked exception  know by compile time but it comes exeception only in runtime, its must be handle by  compiletine.
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		String name = null;
		name.length();
	}

}
