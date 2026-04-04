package com.kodewala.encapsulation;

// Encapsulations of example 
// Encapsulation is the wrapping/ binding  the data and methode   together inside a class ,retrict direct 
// access to the variables(data) by making  private variables. it provides control access through public methode like
// getter and setter.


class BankAccount1 {

	private double balance;

	BankAccount1(double balance) {
		this.balance = balance;

	}

	public double getAmount() {
		return balance;

	}

	public void doposit(double amount) {

		if (amount > 0) {
			balance = balance + amount;
			System.out.println("deposite the amount:" + amount);

		} else {
			System.out.println("no deposite balance");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdraw the amount:" + amount);

		} else {
			System.out.println("InSufficient balance");
		}

	}
}

public class Driver2 {
	public static void main(String[] args) {
		BankAccount1 ba = new BankAccount1(4000);
		ba.doposit(1000);
		System.out.println(" total deposit amount:" + ba.getAmount());
		
		ba.withdraw(500);
		System.out.println("Withdraw amount after the total  balance:" + ba.getAmount());
		
	}

}
