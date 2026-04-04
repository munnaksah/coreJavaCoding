package com.kodewala.col.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {

		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	

	public int getSalary() {
		return salary;
	}

	
	

}

public class Driver {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee("munna " , 125000);
		Employee e2 = new Employee("sandesh " , 12500);
		Employee e3 = new Employee("shrikesh " , 15000);
		Employee e4 = new Employee("mukesh " , 25000);
		Employee e5 = new Employee("rahul " , 75000);
		Employee e6 = new Employee("deepak " , 35000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		Collections.sort(list , new NameComparator());
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + emp.getSalary());
			
		}
		
		
		

	}

}
