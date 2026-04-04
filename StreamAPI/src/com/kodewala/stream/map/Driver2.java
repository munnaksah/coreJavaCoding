package com.kodewala.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
 public static void main(String[] args) {
	
	 List<String> list = Arrays.asList("Munna" ,"Deepak" ,"Sudhir");
	 
	 List<Character> firstChar = 	 list.stream().map(c-> c.charAt(0)).collect(Collectors.toList());

  System.out.println(firstChar);
 }
}
