package com.kodawala.thread;

public class Debit extends Thread {
	Bank bank;
	
	public Debit(Bank _bank) {
//		this.bank= _bank;
		bank = _bank;
	}
	
	
	public void run() {
		bank.doDebit(100);
	}

}
