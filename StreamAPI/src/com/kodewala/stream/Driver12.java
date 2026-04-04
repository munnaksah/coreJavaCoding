package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver12 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bangalore","Hyd","Pune","Bhu","Bhuvneshwar","Delhi","noida");
	
	
	
	
	
	Map<Boolean, List<String>> map = 	list.stream().collect(Collectors.partitioningBy(w->w.startsWith("B")));
	
	
	System.out.println(map);
	}

}
