package com.kodawala.thread;

public class Credit extends Thread {
	Bank bank;
	
	public Credit( Bank _bank) {
		bank = _bank;
		
	}
	
	public void run() {
		bank.doCredit(100);
	}

}
