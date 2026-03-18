package com.kodewala.collection1;

class Employee {
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;

		return this.firstName.equals(e2.firstName) && this.lastName.equals(e2.lastName);

	}

	@Override
	public int hashCode() {
		return (this.firstName + this.lastName).hashCode();
	}

}

public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee("munna", "kumar");
		Employee e2 = new Employee("munna", "kumar");

		System.out.println(e1 == e2); // false
		System.out.println(e1.equals(e2)); // true

		System.out.println("e1's hashcode:" + e1.hashCode()); // hashcode same of the 2 object bcz equal method
		System.out.println("e2's hashcode:" + e2.hashCode());

	}
}
