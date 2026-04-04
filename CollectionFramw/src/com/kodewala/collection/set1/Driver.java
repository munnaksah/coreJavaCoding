package com.kodewala.collection.set1;

import java.util.HashSet;
import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new  HashSet<>();//16
		hashSet.add("MUM");
		hashSet.add("DEL");
		hashSet.add("GUJRAT");
		hashSet.add("BLR");
		hashSet.add("PATNA");
		hashSet.add("SURAT");
		hashSet.add("PUNE");
		hashSet.add("MEERUT");
		hashSet.add("LUCKNOW");
		hashSet.add("AMH");
		hashSet.add("KOCHI");
		hashSet.add("NAGPUR");
		
		System.out.println(hashSet);
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			
			System.out.println(str);
			
		}
		
	}
	

}
