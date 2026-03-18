package com.kodewala.collection.set;

import java.util.HashSet;

public class Driver3 {
	public static void main(String[] args) {
		 HashSet<String> hashSet = new HashSet<>(8);
		 hashSet.add("BLR");
		 hashSet.add("CH");
		 hashSet.add("HYD");
		 hashSet.add("MUM");
		 hashSet.add("DEL");
		 hashSet.add("AHM");  // added to  6th index
		 hashSet.add("AHM");// added to  6th index(ingored)
		 
		 System.out.println(hashSet);
		 
		
		 
		 System.out.println("AHM" .hashCode());
		 
	}

}
