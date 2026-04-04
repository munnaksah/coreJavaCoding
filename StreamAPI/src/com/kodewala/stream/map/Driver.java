package com.kodewala.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,5,6,7,8,9);
		
		List<Integer> squareNum =	list.stream().map(x -> x*x).collect(Collectors.toList());
		
		System.out.println(squareNum);
	}

}
