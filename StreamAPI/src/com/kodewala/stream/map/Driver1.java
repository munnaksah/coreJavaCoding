package com.kodewala.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	
	public static void main(String[] args) {
		List<String> list =  Arrays.asList("bangalore","pune","hyd","nasik","mumbai","delhi");
		
		List<String> upperCase = list.stream().map(c-> c.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperCase);
	}

}
