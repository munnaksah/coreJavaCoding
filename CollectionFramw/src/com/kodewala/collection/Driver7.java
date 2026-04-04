package com.kodewala.collection;

class Person {
	String firstName;
	String lastName;

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	@Override
	public boolean equals(Object obj) {
		Person p1 = (Person) obj;
		return this.firstName.equals(p1.firstName) && this.lastName.equals(p1.lastName);

	}

	@Override
	public int hashCode() {
	 
		return (this.firstName + this.lastName).hashCode();

	}
}

public class Driver7 {

	public static void main(String[] args) {

		Person p1 = new Person("munna", "kumar");
		Person p2 = new Person("munna", "kumar");

		System.out.println(p1 == p2); // f

		System.out.println(p1.equals(p2)); // true

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
