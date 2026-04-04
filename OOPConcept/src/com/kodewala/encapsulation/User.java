package com.kodewala.encapsulation;

public class User  {
	public static void main(String[] args) {
		Account account = new Account(1000 , "munna");
		System.out.println("Initials bal " + account.getBalance());
		
//		account.balance = 12000;
		account.doFundTransfer(1200, "1234");
		System.out.println("Balance now "+ account.getBalance());
		

		
		
		
	}

}
