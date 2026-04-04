package com.kodewala.collection.set1;

public class Employee2 {

	String firstName;
	String lastName;

	Employee2(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	
	

	@Override
	public boolean equals(Object obj) {
		Employee2 em1 = (Employee2) obj;

		return this.firstName.equals(em1.firstName) && this.lastName.equals(em1.lastName);

	}

	@Override
	public int hashCode() {
		return ((this.firstName + this.lastName).hashCode());
	}

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2("munna", "kumar");
		Employee2 emp2 = new Employee2("munna", "kumar");

		System.out.println(emp1 == emp2);

		System.out.println(emp1.equals(emp2));
	}

}
