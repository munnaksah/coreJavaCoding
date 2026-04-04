package com.kodewala.inf1;

interface IBanks{
	void doPayment();   
	
	void cancelTxns();
public 	default  void printPassbooks() {
		// default method - to achieve backward compatibility
	System.out.println("printbook  here ");
	}

// this is common code, all sub classes can re use it. to remove duplicate code . to use static  method
public static void sendEmail() {
	System.out.println("newIDFC sendEmail()");
}
}

class NewHDFC implements IBanks{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTxns() {
		// TODO Auto-generated method stub
		
	}
	
}

class NewIDFC implements IBanks
{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTxns() {
		// TODO Auto-generated method stub
		
	}
	
}

class BiharBank implements IBanks{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTxns() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	 public void  printPassbooks() {
		
	}
	public static void main(String[] args) {
		BiharBank bb = new BiharBank();
		bb.printPassbooks();
//		bb.sendEmail();
		
		
		
		
		
		
	}

	
	
}

public class Driver1 {

}
