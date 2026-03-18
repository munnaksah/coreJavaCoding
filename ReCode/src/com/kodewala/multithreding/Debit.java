package com.kodewala.multithreding;

public class Debit extends Thread {
	Bank bank;

	public Debit(Bank bank) {
		this.bank = bank;

	}

	public void run() {
		bank.doDebit(200);

	}
}
