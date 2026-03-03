package com.org.kodewala.Calculators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class CalcMainTest {
	static CalcMain  calcMain;
	@BeforeAll
 public static  void beforeAll() { // this is execute only one time 
		System.out.println("CalcMainTest.beforeAll");
		calcMain = new CalcMain();
		
	}
	
	@BeforeEach// this is execute every test cases  nd every time
	public void setupBeforeEachTest() {
		System.out.println("setupCalcMainTest.before()");
	}

@Test
	public void testAddNumber() { // +ve case 

//		CalcMain calcMain = new CalcMain();
		int excepted = 20; // u r expecting  
		int actual = calcMain.addNumber(5, 15);// method return 
		
		assertEquals(excepted, actual);

	}
	
@Test
	public void testAddNumberFirstZero() {
		
//		CalcMain calcMain = new CalcMain();
		int excepted = 40;
		int actual =  calcMain.addNumber(0, 40);
		
		assertEquals(excepted, actual);
		
		
	}
	
	

}
