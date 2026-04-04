package com.kodewala.collection.set;

import java.util.HashSet;
import java.util.Iterator;

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
		 
		 for(String str : hashSet) {
			 System.out.println(str);
			 
		 }
		 
		 Iterator<String> itr = hashSet.iterator();
		 
		 while(itr.hasNext()) {
			 
			 String ele  = itr.next();
			 
			 System.out.println(ele);
			 
		 }
		 
		
		 
		 System.out.println("AHM" .hashCode());
		 
	}

}
