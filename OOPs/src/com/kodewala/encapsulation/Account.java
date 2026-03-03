package com.kodewala.encapsulation;

public class Account {
	 private int balance ;  // Attributes//field // state// Data
	 private String name; // no one will be able to acees  this variable out side the class 
	 
	 
	 public Account(int balance, String name) {
		 this.balance = balance;
		 this.name = name;
		 
	 }
	 
	 
	 public void doFundTransfer(int _amountToBeTransferred, String _pin) {
		 if(_pin.equals("1234") && _amountToBeTransferred>0) {
			 
			 balance  = balance + _amountToBeTransferred;
			 
		 } else {
			 System.out.println("Invalid PIN or -ve amount enterd");
		 }
		 System.out.println("New balane is " + balance);
	 }
	 public int getBalance() {
		 return balance;   
	 }
	
	

}
