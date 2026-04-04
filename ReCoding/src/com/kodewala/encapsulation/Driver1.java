package com.kodewala.encapsulation;

class Bank {
	private int num ;

	public Bank(int num) {

		this.num = num;
	}

	public int getNumber() {
		return num;

	}
	
	public void setNumber( int num) {
		this.num = num;
	}
}

public class Driver1 {
	public static void main(String[] args) {
		Bank bank = new Bank(500);
		bank.getNumber();
		System.out.println("give the value:"+ bank.getNumber());
		
		bank.setNumber(1000);
		System.out.println("given the another value :" + bank.getNumber());
		
		

	}

}
