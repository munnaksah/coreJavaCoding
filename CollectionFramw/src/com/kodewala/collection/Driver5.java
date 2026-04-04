package com.kodewala.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		
		list.add("BLR");
		
		list.add("HYD");
		
		list.add("DEL");
		
		list.add("MUM");
		
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			String element = (String)itr.next();
			
			if(element.equals("DEL")) {
				itr.remove();
				System.out.println("element remove");
			}
			
			
			
			
		}
		System.out.println(list);
		
	}

}
