package com.kodewala.funcint;
@FunctionalInterface
interface Clac{
	public abstract int  doMultiply(int  a,int b);
}

public class Driver2 {
	public static void main(String[] args) {
		
		Clac clac = (x,y) -> {
			return x*y;
			
		};
		
		System.out.println(" given the number , you just  give the result :" + clac.doMultiply(55,99));
		
		
	}

}
