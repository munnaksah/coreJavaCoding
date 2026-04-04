package com.kodewala.funcint;

// this is a normal of interface to calculate
interface Calcultors{
	
	public abstract int add(int a, int b);
}


 

public class Driver5  implements Calcultors {
	public static void main(String[] args) {
		Calcultors cl = new Driver5();
	int result =	cl.add(4,6);
	System.out.println(result);
		
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
