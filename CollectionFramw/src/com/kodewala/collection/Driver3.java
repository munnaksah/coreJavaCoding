package com.kodewala.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver3 {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("blr");
		list.add("mum");
		list.add("up");
		//  iterating element for for each loop
		for(String element : list) {
//			list.remove(2);
			System.out.println(element);
			
		}
		
		// iterating element  using Iterator
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			
			String  ele = (String)itr.next();
			
			System.out.println(ele);
			
		}
		
	}
}
