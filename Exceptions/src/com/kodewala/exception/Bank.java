package com.kodewala.exception;

public class Bank {
	
	double  balance;
	public void  doFundTransfer() throws InsufficientFundTransferException {
		if(balance>0) {
			
			throw new InsufficientFundTransferException("Insufficient balance:"+ balance);
			
			
			
		} else {
			System.out.println(" you can  check your balance:"+ balance);
		}
	}
	
	
	public static void main(String[] args) {
		
		Bank bank  = new Bank();
		try {
			bank.doFundTransfer();
		} catch (InsufficientFundTransferException e) {
			  
			e.printStackTrace();
		}
		
	}

}
