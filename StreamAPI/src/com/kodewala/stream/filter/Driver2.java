package com.kodewala.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return name + " - " + salary;
	}

}

public class Driver2 {
	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(1, "Munna", 45000), new Employee(2, "Arun", 60000),
				new Employee(3, "Rahul", 70000));

		List<Employee> salary = list.stream().filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList());

		System.out.println(salary);
	}

}
