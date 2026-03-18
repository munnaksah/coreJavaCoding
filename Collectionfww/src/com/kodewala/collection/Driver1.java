package com.kodewala.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver1 {
	public static void main(String[] args) {
		// Arraylist is best for  random access /read element .O(1)best time complexity
		// -> Arraylist is continuous memory allocation
		//  
		//modification is 
		ArrayList<String> state = new ArrayList<>();
		state.add("karnataka");
		state.add("delhi");
		state.add("TN");
		state.add("MP");
		state.add("UP");
		
//		System.out.println(state);
			state.add(2,"HP");
		System.out.println(state);
		
		
		for(int i= 0;i< state.size();i++) {
			String element = state.get(i);
			
			if(element.startsWith("k")) {
				System.out.println(element.toUpperCase());
				
			}
			
		}
		
		//for each
		for(String element : state) {
			
			System.out.println(element);
			
		}
		
		
		// iterator
		
		Iterator<String> itr = state.iterator();
		
		System.out.println("Using iterator::::::");
		
		
		while(itr.hasNext()) {
			String element  = (String)itr.next();
			System.out.println(element);
			
		}
		
		
		
		
	}

}
