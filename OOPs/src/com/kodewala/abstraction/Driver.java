package com.kodewala.abstraction;

abstract class Account {
	double balance;;

	public Account(double amount) {
		this.balance = balance;

	}

	abstract void calculatedInterest();

	void showBalance() {
		System.out.println("Curennt balance " + balance);
	}
}

class SavingAccount extends Account {

	double interestRate = 5.0; // 5% interest rate

	public SavingAccount(double balance) {
		super(balance);

	}

	@Override
	void calculatedInterest() {
		
		double interest = (balance *interestRate)/100;
		 balance += interest;
		System.out.println("calaculated interest "+ interest);
	}

}

class CurrentAccount extends Account{

	public CurrentAccount(double balance) {
		super(balance);
	
	}

	@Override
	void calculatedInterest() {
		
		System.out.println("no interestrate for currentAcccount");    
		
		
	}
	
}

public class Driver {
	public static void main(String[] args) {
		Account ac = new SavingAccount(2000);
	
	   ac.showBalance();
	   ac.calculatedInterest();
	   ac.showBalance();
		

	}

}
