package com.org.kodewala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcuTest {
	
	@Test
	public void  testAddNumber() {
		
		Calcu cal  = new Calcu();
		int expected  = 10;
		int actual  = cal.addNumber(5, 5);
		
		assertEquals(expected, actual);
		
	}
	
	

}
