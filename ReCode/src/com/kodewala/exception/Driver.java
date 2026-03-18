package com.kodewala.exception;

public class Driver {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		try {
		System.out.println("give me the index 4:"+arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+ "you can now do it whatever you want");
			
		}
		System.out.println("running succesful ");
	}
	

}
