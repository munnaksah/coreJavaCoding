package com.kodewala.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		List<String> cityList = new ArrayList<>();

		cityList.add("Bangalore");
		cityList.add("Pune");
		cityList.add("Mumbai");
		cityList.add("Patna");
		cityList.add("Delhi");

		// Task = convert all the cities to upper case using stream API.

		// 1 convert the collection in stream
		Stream<String> stream = cityList.stream();

		// 2 - perform operation(contovert the stream /element to upper case )

		Stream<String> convertedStream = cityList.stream().map(word -> word.toUpperCase());

		// 3 collect the data

		List<String> output = convertedStream.collect(Collectors.toList());

		System.out.println("output" + output);

	}

}
