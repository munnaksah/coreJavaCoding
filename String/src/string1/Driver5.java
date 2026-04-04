package string1;

class Person {
	String name;

	public Person(String name) {
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {

		Person p1 = (Person) obj;

		return this.name.equals(p1.name);
	}

	@Override
	public int hashCode() {
		return (this.name).hashCode();
	}
}

public class Driver5 {
	public static void main(String[] args) {

		Person p1 = new Person("java developer");
		Person p2 = new Person("java developer");

		System.out.println(p1 == p2); // f

		System.out.println(p1.equals(p2)); // t

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
