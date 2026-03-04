package com.kodewala.inheritance;

class Account{
	
	double balance;
	
	Account(double balance){
		this.balance = balance;
		
	}
	
	public void showBalance() {
		System.out.println("Account balance:"+ balance);
	}
	
}


class SavingAccount extends Account{
	double interestRate;

	SavingAccount(double balance,double interestRate) {
		super(balance);
		this.interestRate = interestRate;
		
	}
	
	public void calculateInterest() {
		double interest = balance *interestRate/100;
		System.out.println("Interest Earn :"+ interest);
	}
	
}

public class BankSystem {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1005700,5);
		sa.showBalance();
		sa.calculateInterest();
		
	}

}
