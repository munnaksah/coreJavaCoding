package com.kodewala.funcint;
@FunctionalInterface
interface Calcs{
	public  abstract  int doSub(int a, int b);
	
}

public class Driver4 {
	public static void main(String[] args) {
		Calcs calcs = (x,y) -> x-y;
		
		System.out.println("do give me result: " + calcs.doSub(88, 20));
		
		
	}

}
