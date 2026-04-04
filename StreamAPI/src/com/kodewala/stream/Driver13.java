package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver13 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Rohit","Virat","Surys","Hardrik p","MSD","Sanju","Nitish ");
	
		Map<Integer, List<String>> map  =list.stream().collect(Collectors.groupingBy(w->w.length()));
	
	System.out.println(map);
	
	
	}

}
