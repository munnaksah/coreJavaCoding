package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;

public class Driver7 {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("i","am","bangalore","bangalore","is","is","in","living","living");
		
		// remove duplicates
			words.stream().distinct().forEach(v-> System.out.println(v));
			
			//  find the first element
			
			String output = words.stream().distinct().findFirst().get();
			System.out.println("find first element :"+output);
			
			
			//// skip the first element
			String output1 = words.stream().skip(1).findFirst().get();
			System.out.println("skp first element :"+output1);
			
			
			// limit the 5 element 
			
			
			System.out.println("find the first 5 element");
			
			words.stream().limit(5).forEach(v->System.out.println(v));
			
			
			
			// sorting 
			
			System.out.println(" here form sorting   ");
			
			words.stream().sorted().forEach(v->System.out.println(v));
			
			words.stream().sorted((a,b) -> b.length()- a.length() ).forEach(v->System.out.println(v));
			
			
			
	}

}
