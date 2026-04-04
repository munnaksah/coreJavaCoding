
package com.kodewala.collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Driver1 {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();

		set.add("munna");

		set.add("kumar");

		set.add("sah");

		set.add("munna");

		set.add("kumar");

		set.add("sah");

//		set.add(null);

		System.out.println(set);
	}

}
