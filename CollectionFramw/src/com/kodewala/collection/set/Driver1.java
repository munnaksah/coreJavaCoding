package com.kodewala.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Driver1 {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new  HashSet<>();
		
		
		hashSet.add("munna");
		hashSet.add("sansesh");
		hashSet.add("shrikesh");
		hashSet.add("mukesh");
		hashSet.add("Deepak");
		hashSet.add("sudhir");
		
//		System.out.println(hashSet);
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) { // true or false
			
			String element = itr.next(); // (true)get the element  or (false) not get element
			System.out.println(element);
			
		}


	}

}
