package com.kodewala.collection;
// hashcode nd equals method imp point

//1- if two objects are equal then their hash code must be same.

//2 -  if  two objects return same hashcode, they may or may not be  equals

/*
 * string s1 = new ("test");
 *  string s2   = new ("test");
 */


// 

public class Employee {
	String firstName;
	String LastName;
//	int age;

	public Employee(String firstName, String lastName ) {

		this.firstName = firstName;
		LastName = lastName;
//		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;
		return   this.firstName.equals(e2.firstName) && this.LastName.equals(e2.LastName); 
		
	}
	@Override
	public int hashCode() {
		return (this.firstName + this.LastName).hashCode();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("kodewala", "Academy");
		Employee e2 = new Employee("kodewala", "Academy");
//		Employee e3 = new Employee("kodewala", "Academy",44);

		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		
		System.out.println("e1's hash code"+ e1.hashCode() );
		System.out.println("e2's hash code"+ e2.hashCode() );
//
//		System.out.println("e3's hash code"+ e3.hashCode() );

	}

	

}
