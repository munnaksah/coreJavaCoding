package com.kodewala.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver8 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("RCB");
		list.add("CHE");
		list.add("KOL");
		list.add("LUCKNOW SUPERJ");
		list.add("MUMBAI");
		list.add("SUNRISES HYB");
		
//	System.out.println(list);
//	
//	for(String ele : list) {
//		
//		System.out.println(ele);
//		
//	}
	
	Iterator<String > itr = list.iterator();
	while(itr.hasNext()){
		String ele = itr.next();
		System.out.println(ele);
		
	}
		
	}

}
