package com.kodewala.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver4 {
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("mum");
		list.add("del");
		list.add("patna");
		
		for(String element : list) {
			
			System.out.println(element);
			
			if(element.equals("del")) {
				list.remove(1);
				System.out.println("remove element");
				
				
			}
////			list.add(2,"pune");
//			list.remove(1);
//			break;
			
		}
		System.out.println(list);
	}

}
