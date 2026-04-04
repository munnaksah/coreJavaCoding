package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 1. Even Numbers Square

👉 Given a list of integers:

Filter only even numbers
Then return their square
 */

public class Driver4 {
	
	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(2,4,5,7,5,8,10,12,14,15,16,18,20);
		
		List<Integer> nums =	list.stream().filter(x -> x %2 == 0).map(x->x*x).collect(Collectors.toList());
		 System.out.println("numbers found :  " + nums);
		
	}

}
