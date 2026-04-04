package com.kodewala.funcint;
@FunctionalInterface
interface ICalcul{
	public abstract int doCalculation(int a, int b);
	
}

public class Driver7 {
	public static void main(String[] args) {
		calculate(10,20,(i,j) -> i+j);
		calculate(100,20,(i,j) -> i-j);
		calculate(10,20,(i,j) -> i*j);
		calculate(80,20,(i,j) -> i/j);
		
		
//		ICalcul cal = (i,j) ->i+j;
//		
//		System.out.println(cal.doCalculation(4, 06));
		
	}

	public static void calculate(int x, int y, ICalcul cal) {
		System.out.println(" give me the output:"+cal.doCalculation(x, y));
		
	}
}
