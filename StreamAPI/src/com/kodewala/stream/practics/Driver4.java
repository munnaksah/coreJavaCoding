package com.kodewala.stream.practics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// merge two list and remove duplicates

public class Driver4 {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		List<Integer> list2 = Arrays.asList(11,22,13,64,35,55,4,6);
		
		List<Integer> merge = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		
System.out.println(merge);
		
	}

}
