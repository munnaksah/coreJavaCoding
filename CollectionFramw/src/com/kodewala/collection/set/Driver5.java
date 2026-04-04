package com.kodewala.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Driver5 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>(); // 16
		hashSet.add("munna");
		hashSet.add("kumar");
		hashSet.add("sansesh");
		hashSet.add("shrikesh");
		hashSet.add("arun");
		hashSet.add("anand");
		hashSet.add("rohan");
		hashSet.add("rahul");
		hashSet.add("vikas");
		hashSet.add("nitish");
		hashSet.add("satish");
		hashSet.add("mukesh");
		hashSet.add("Denil");
		
		System.out.println(hashSet);
		
		for(String str : hashSet) {
			System.out.println(str);
			
		}
		
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			String str = (String)itr.next();
			System.out.println(str);
			
		}
		
		
		System.out.println("munna".hashCode());

}
}
