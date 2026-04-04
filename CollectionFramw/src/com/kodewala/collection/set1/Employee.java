package com.kodewala.collection.set1;

import java.util.HashSet;
import java.util.Objects;

public class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.name = name;
		this.id = id;

	}
	

//	@Override
//	public int hashCode() {
//		return 1;
//	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee e = (Employee) o;
		return id == e.id && Objects.equals(name, e.name);

	}

	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<>();

		set.add(new Employee(1, "A"));

		set.add(new Employee(2, "B"));
		set.add(new Employee(3, "C"));
		set.add(new Employee(4, "D"));
		set.add(new Employee(5, "E"));
		set.add(new Employee(6, "F"));
		set.add(new Employee(7, "G"));
		set.add(new Employee(8, "H"));
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println("B".hashCode());
	}

}
