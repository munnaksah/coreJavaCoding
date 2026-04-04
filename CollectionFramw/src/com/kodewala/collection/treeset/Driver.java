package com.kodewala.collection.treeset;

import java.util.Set;
import java.util.TreeSet;
// TreeSet no null , if you add null then it will throw NullPointerException .

class Employee implements Comparable<Employee> {
	String name;

	Employee(String name) {
		this.name = name;

	}

	@Override
	public int compareTo(Employee o) {
		int result = this.name.compareTo(o.name);
		System.out.println("result is " + result);
		return result; // -Ve ,Zero, +Ve

		// if return Zero that means deblicate element , not return anything .
	}
}

public class Driver {
	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<>();

		set.add(new Employee("kodewala"));
		set.add(new Employee("Academy"));
		set.add(new Employee("bangalore"));

		System.out.println(set.size());

		for (Employee emp : set) {
			System.out.println(emp.name);

		}

		System.out.println();

//		set.add("BLR");
//		set.add("KOL");
//		set.add("AMH");
//		set.add("PUNE");
//		set.add("PUNE");
		System.out.println(set);

	}

}
