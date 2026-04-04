package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Bangalore","Chennai","Hyd","Delhi","Bombay","Bbr","patna","nasik","Ahmadabad");
		
	Stream<String> inputStream = 	cities.stream();
	
	Stream<String> citiesLength  =	inputStream.filter(c -> c.length()>5);
	Stream<String> upperCaseStream  = 	citiesLength.map(w -> w.toUpperCase());
	
	List<String> output = upperCaseStream.collect(Collectors.toList());
	
	System.out.println("output :" + output);
	
	
	
	
	
		  
	}

}
