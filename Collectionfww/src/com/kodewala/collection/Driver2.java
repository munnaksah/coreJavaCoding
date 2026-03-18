package com.kodewala.collection;

import java.util.LinkedList;

public class Driver2 {
	public static void main(String[] args) {
		
		LinkedList<String> list =  new LinkedList<>();
		list.add("BLR");
		list.add("Chennai");
		list.add("HYD");
		list.add("DEL");
		list.add("KOL");
	System.out.println(list);
	
	
	list.add(2,"Ahmedabad");
	System.out.println(list);
		
	}

}
