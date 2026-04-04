package com.kodewala.multithreding;

public class Singleton {
	
	private static Singleton Instance;
	
	 private Singleton(){
		System.out.println("created the singleton ");
	}
	
	public static synchronized Singleton getInstance() {
		
		if(null == Instance ) {
		Instance = 	new Singleton();
		}
		return Instance;
		
	}

}
