package com.org.kodewala.ecommerce.jdbc.exception;

public class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String _message) {
		super(_message);
	}
}
