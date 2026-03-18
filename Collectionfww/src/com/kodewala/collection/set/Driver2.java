package com.kodewala.collection.set;

import java.util.HashSet;

public class Driver2 {
	public static void main(String[] args) {
		 HashSet<String> hashSet = new  HashSet<>();
		 hashSet.add("Bike");
		 hashSet.add("Apachi");
		 hashSet.add("Pulsure");
		 hashSet.add("R15");
		 hashSet.add("Gt650");
//		 hashSet.add("Gt650");
		 
		 System.out.println(hashSet);
		 
		 System.out.println("Gt650".hashCode());
		 
	}

}
