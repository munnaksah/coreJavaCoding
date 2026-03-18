package com.kodewala.multithreding;

public class Credit extends Thread {
	Bank bank;
	
	public Credit(Bank bank){
		this.bank = bank;
		
	}
	
	
	public void run() {
		bank.doCredit(200);
	
	}

}
