package com.kodewala.collection.set;
/*
 * Set - set is interface
 * set is store uniqe element(no duplicate)
 * hashSet is un-order tha means does not maintain insertion order.
 * hashset only one null
 * 
 */

import java.util.HashSet;

import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {

		HashSet<String> hashset = new HashSet<>();

		hashset.add("BLR");
		hashset.add("MUM");
		hashset.add("DLH");
		hashset.add("AHM");
		hashset.add("HYB");
		hashset.add("KOL");
		hashset.add("KOL");
		hashset.add(null);
		hashset.add(null);
		hashset.add(null);
		hashset.add(null);

//		System.out.println(hashset);
		
		Iterator<String> itr = hashset.iterator();

		while(itr.hasNext()) {
			String element = (String)itr.next();
			System.out.println(element);
			
		}
		System.out.println("BLR".hashCode());

//		System.out.println(hashset.contains("BLR"));
//
//		System.out.println("MUM".hashCode());
//
//		System.out.println("AHM".hashCode());
//
//		System.out.println("KOL".hashCode());
	}

}
