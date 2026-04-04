package com.kodewala.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Driver2 {
	public static void main(String[] args) {
		 HashSet<String> hashSet = new  HashSet<>();
		 hashSet.add("Bike");
		 hashSet.add("Apachi");
		 hashSet.add("Pulsure");
		 hashSet.add("R15");
		 hashSet.add("Gt650");
		 hashSet.add("Gt650");
		 
//		 System.out.println(hashSet);
		 
		 for(String str : hashSet) {
			 System.out.println(str);
			 
		 }
		 
		 Iterator<String> itr = hashSet.iterator();
		 
		 
		 while(itr.hasNext()) {
			 String ele = itr.next();
			 System.out.println(ele);
			 
		 }
		 
		 
		 System.out.println("Gt650".hashCode());
		 
	}

}
