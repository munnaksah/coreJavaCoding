package com.kodewala.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,4,5,3,5,4,2,12,10,14,16);
		
	List<Integer> evenNum = list.stream().filter(n->n%2 == 0).collect(Collectors.toList());

	System.out.println(evenNum);
	
	}

}
