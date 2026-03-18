package com.kodewala.collection.set;

import java.util.HashSet;

public class Employee {
	public static void main(String[] args) {
		HashSet<Employee> hashSet = new HashSet<Employee>(64);
		hashSet.add(new  Employee());
		hashSet.add(new  Employee());
		hashSet.add(new  Employee());
		
		
		Employee e4 = new Employee();
		hashSet.add(e4);
		
		Employee e5 = new Employee();
		hashSet.add(e5);
		Employee e6 = new Employee();
		hashSet.add(e6);
		Employee e7 = new Employee();
		hashSet.add(e7);
		Employee e8 = new Employee();
		hashSet.add(e8);
		
		Employee e9 = new Employee();
		hashSet.add(e9);
		
		
		System.out.println(hashSet);
	

	}
	
	
	@Override
	public int hashCode() {
		return 12345 ;
	}

}
