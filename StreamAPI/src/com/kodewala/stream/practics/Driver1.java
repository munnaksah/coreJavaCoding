
package com.kodewala.stream.practics;

import java.util.Map;
import java.util.stream.Collectors;

// count freq of character
public class Driver1 {

	public static void main(String[] args) {
		String s = "javadevloperrdv";

		Map<Character, Long> freq = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(freq);

	}

}
