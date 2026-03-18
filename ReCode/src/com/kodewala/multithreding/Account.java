package com.kodewala.multithreding;

class Bank {
	int balance = 5000;

	public synchronized void doCredit(int amount) {
		for (int i = 0; i < 5; i++) {
			balance = balance + amount;
			System.out.println("when you do credit  after your final amount: " + amount + "balance:" + balance
					+ Thread.currentThread());
		}
	}

	public synchronized void doDebit(int amount) {
		for (int i = 0; i < 5; i++) {
			balance = balance - amount;
			System.out.println("when you do  debit  after your final amount: " + amount + "balance:" + balance
					+ Thread.currentThread());

		}

	}

}

public class Account {
	public static void main(String[] args) {

		Bank ba = new Bank();

		Credit cc = new Credit(ba);
		cc.setName("credited thread");
		cc.start();

		Debit dd = new Debit(ba);
		dd.setName("debited thread");
		dd.start();

	}
}