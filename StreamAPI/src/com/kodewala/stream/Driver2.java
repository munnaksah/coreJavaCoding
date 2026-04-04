package com.kodewala.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10, 12, 13, 14, 16);

		List<Integer> findEvenNum = numbers.stream().filter(n -> n % 2 == 0).map(x->x*2).collect(Collectors.toList());;

//		Stream<Integer> SqureNum = 	stream.findEvenNum.Map(findEvenNum *2);
		
		System.out.println(findEvenNum);

	}

}
