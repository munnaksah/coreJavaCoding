package com.kodewala.stream.map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver4 {
	public static void main(String[] args) {
		List<LocalDate> dates = Arrays.asList(LocalDate.now());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		List<String> result = dates.stream()
		        .map(d -> d.format(formatter)).collect(Collectors.toList());
		
		System.out.println(result);
		        
	}

}
