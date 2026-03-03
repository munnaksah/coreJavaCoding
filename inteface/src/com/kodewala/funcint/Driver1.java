package com.kodewala.funcint;


@FunctionalInterface
interface ICalc{
	
	public abstract int doCalculation(int a , int b);
	
	
	
}

public class Driver1 {
	public static void main(String[] args) {
		
		ICalc calc = (i,j) -> {
			return i+j;
			
		};
		System.out.println(" give me the sum of two number:"+ calc.doCalculation(6, 9) );
		
		
		
	} 

}
