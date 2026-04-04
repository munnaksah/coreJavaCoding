package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver9 {
	public static void main(String[] args) {

		List<List<Integer>> list = Arrays.asList(Arrays.asList(2, 4, 6, 5, 8, 9),
				(Arrays.asList(12, 77, 86, 65, 18, 19)), (Arrays.asList(20, 40, 60, 50, 8, 9)));

		List<Integer> num = list.stream().flatMap(n -> n.stream()).filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(num);
	}

}
