package com.kodewala.polymorphism;
// overriding - Runtimepolymorphism 

/*
 * 6-> Key Rule of Runtime Polymorphism

Runtime polymorphism works only when:

1️⃣ Inheritance present ho
2️⃣ Method overriding ho
3️⃣ Parent reference ho
4️⃣ Child object ho
 */
// overriding that means  Method overriding is a feature of runtime polymorphism where a child class provides its own implementation of a method that is already defined in the parent class. The method name, return type, and parameters must remain the same,
//but the behavior of the method can be different in the child class.

class Payment {
	void processPayment(double amount) {
		System.out.println("Processing generic payment:" + amount);
	}
}

class UPIPayment extends Payment {
	@Override
	void processPayment(double amount) {
		System.out.println("Processing UPI payment:" + amount);

	}

}

class CCPay extends Payment {
	@Override
	void processPayment(double amount) {
		System.out.println("Processing credit card payment:" + amount);

	}

}

public class PaymentSystem {
	public static void main(String[] args) {
		Payment pay = new UPIPayment();
		pay.processPayment(500);

		Payment paym = new CCPay();
		paym.processPayment(2000.50);

	}

}
