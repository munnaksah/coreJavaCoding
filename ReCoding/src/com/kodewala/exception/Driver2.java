package com.kodewala.exception;

class Bank {
	int balance = 5000;

	public void withdraw(int amount) throws InsufficientBalanceException {

		if (balance < amount) {

			throw new InsufficientBalanceException("Insufficient balance");

		}
		balance  = balance-amount;
		System.out.println("you check your balance:"+ balance);

	}

	
public static class Driver2 {
	public static void main(String[] args) throws InsufficientBalanceException {
		Bank bank = new Bank();
		bank.withdraw(10000);
		
	}

}
}


