package com.kodewala.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 2. Employee Salary Hike

👉 Given a list of Employee (name, salary)

Filter employees with salary < 50,000
Increase their salary by 5%
Return updated list
 */

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return (" name : " + name + " salary :" + salary);
	}

}

public class Driver5 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Munna", 40000), new Employee("Arun", 60000),

				new Employee("Giri", 30000), new Employee("deeptesh", 70000), new Employee("Denial", 40000),
				new Employee("deepak", 20000), new Employee("Sudhir", 40000), new Employee("Vikas", 90000));
		
	List<Employee> empSalary = 	list.stream().filter(sal -> sal.getSalary()<50000)
			.map(emp -> new Employee(
	                emp.getName(),
	                emp.getSalary() * 1.05   // 5% increase
	        )).collect(Collectors.toList());
	
	System.out.println(empSalary);
		
		

	}

}
