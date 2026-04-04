package com.kodewala.collection.set;

import java.util.HashSet;

class Employee {

	String name;

	Employee(String name) {
		this.name = name;

	}
	

	

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp1 = (Employee) obj;

		return this.name.equals(emp1.name);

	}
}

public class Driver6 {
	public static void main(String[] args) {

		HashSet<Employee> hashSet = new HashSet<>();

		Employee emp1 = new Employee("munna");
		Employee emp2 = new Employee("munna");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

		hashSet.add(emp1);
		hashSet.add(emp2);

		System.out.println(emp1 == emp2);

		System.out.println(emp1.equals(emp2));

		

		System.out.println("total employee of + " + hashSet.size());
		
		

	}

}
