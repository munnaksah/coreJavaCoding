package com.org.kodewala.ecommerce.jdbc.exception;

public class OutOfStockException extends Exception{
	public OutOfStockException(String _message) {
		super(_message);
	}
}
