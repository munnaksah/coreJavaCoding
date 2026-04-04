package com.kodewala.collection1;
// 2 equals obj same then hashcode must be same 

class Student {
	String name;
	String collegeName;

	Student(String name, String collegeName) {
		this.name = name;
		this.collegeName = collegeName;

	}

	@Override
	public boolean equals(Object obj) {

		Student s2 = (Student) obj;
		return this.name.equals(s2.name) && this.collegeName.equals(s2.collegeName);

	}
	@Override
	public int hashCode() {
		return (this.name + this.collegeName).hashCode();
	}

}

public class Driver1 {
	public static void main(String[] args) {

		Student s1 = new Student("munna", "AKTU");
		Student s2 = new Student("munna", "AKTU");

		System.out.println(s1 == s2);//

		System.out.println("s2' coolegeName:" + s1.equals(s2)); // true
		
		System.out.println(s1.hashCode()); // same hashcose s1 ==s2
		System.out.println(s2.hashCode());// same hashcose s1 ==s2

	}

}
