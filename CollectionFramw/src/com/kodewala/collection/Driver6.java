
package com.kodewala.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(125);
		
		list.add(200);
		list.add(300);
		
//		System.out.println(list);
		
		
//		for(Integer num : list) {
//			System.out.println(num);
//			
//		}
		
		Iterator<Integer> num  = list.iterator();
		
		while(num.hasNext()) {
			
			Integer digit = (Integer)num.next();
			
			System.out.println(digit);
			
		}
		
		
		
	}

}
