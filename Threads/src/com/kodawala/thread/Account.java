 package com.kodawala.thread;
// method level of synchronized
class Bank {
	int balance  = 3000;
	
	public synchronized void doDebit(int amount) {
		for(int i = 0; i<6;i++) {
			
			balance = balance-amount;
			System.out.println("balance after debit "+amount+" = "+ balance +"excuttedby" + Thread.currentThread() );
			
		}
		
		
	}
	
	public  synchronized void doCredit(int amount) {
		for(int i= 0;i<6;i++) {
			balance = balance+amount;
			System.out.println("balance after credit "+amount+" = "+balance+"excutted by" + Thread.currentThread() );

			
		}
	}
}

public class Account {
	public static void main(String[] args) {
		Bank  bank = new Bank();
		
		
		Debit db = new Debit(bank);
		db.setName("Debit thread");
		db.start();
		
		
		
		Credit cr = new  Credit(bank);
		cr.setName("Credit thread");
		cr.start();
		
		
		
		
		
		
	}
	

}
