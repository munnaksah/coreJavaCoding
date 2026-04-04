package polymorshim;

class Animal {
	public void eating() {
		System.out.println("animal is eating");
		
	}
}

class Dog extends Animal{
	public void eating() {
		System.out.println("Dog is eating ");
	}
}

public class Driver4 {
	public static void main(String[] args) {
//		Animal an = new Animal();
//		an.eating();
		Animal a = new Dog();//1 parent refer child class 
		a.eating(); // compile -2 it will chekck the method of eating methos is parent class
		//3- runtime- jvm will be call the  method on actull class(child class)
		
		
	}

}
