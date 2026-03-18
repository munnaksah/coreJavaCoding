package com.kodewala.collection.set;
/*
 * Set - set is interface
 * set is store uniqe element(no duplicate)
 * hashSet is un-order tha means does not maintain insertion order.
 * hashset only one null
 * 
 */

import java.util.HashSet;

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

		System.out.println(hashset);

		System.out.println("BLR".hashCode());

		System.out.println(hashset.contains("BLR"));
//
//		System.out.println("MUM".hashCode());
//
//		System.out.println("AHM".hashCode());
//
//		System.out.println("KOL".hashCode());
	}

}
