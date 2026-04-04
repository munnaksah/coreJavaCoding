package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver11 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45,20,44322,90,23,897,1,2,4,55,6,77,55,44);
		
		
		// find the min.max
		
//		long output = list.stream().max(a,b) ->(a-b).get();
		long output = list.stream().max((a,b)->a-b).get();
		long output1 = list.stream().min((a,b)->a-b).get();
		
		System.out.println(output);
		System.out.println(output1);
		
		
		long output2 = list.stream().collect(Collectors.counting());
		System.out.println(output2);
		
		// partitioningBy
		
	Map<Boolean, List<Integer>> map=	list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
	System.out.println(map);
	}

}
