package com.arun;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		// a good java book
		
		String str = "a good java book";
		String result = Arrays.stream(str.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(result);
		
		long count = str.chars()
				.filter(c -> c == 'o')
				.count();
		System.out.println(count);
				
	}

}
