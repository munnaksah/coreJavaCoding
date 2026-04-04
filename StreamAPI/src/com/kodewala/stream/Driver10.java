package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;

public class Driver10 {
	
	public static void main(String[] args) {
		
		List<Integer> sal = Arrays.asList(10000,30000,50000,55000,70000,70000,120000,10000,3000);
		
	Integer thirdHiSal = 	sal.stream().distinct().sorted().skip(2).findFirst().get();
	
	System.out.println(thirdHiSal);
	}

}
