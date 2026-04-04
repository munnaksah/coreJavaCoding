package com.kodewala.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("Arun", "Munna", "Ankit", "Rahul","Arun", "Tunna", "Aman", "Rul");
		 
		 List<String> names=  list.stream().filter(c->c.startsWith("A")  || c.startsWith("M")).collect(Collectors.toList());
		 
		 System.out.println(names);
	}

}
