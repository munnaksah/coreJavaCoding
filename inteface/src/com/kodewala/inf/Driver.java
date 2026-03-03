package com.kodewala.inf;

interface Ipayment{
	public abstract  void payment();
	public abstract void stopPayment();
}



class CenaraBank implements Ipayment{

	@Override
	public void payment() {
		
		System.out.println(" you can pay direct from cenaraBak and your payment is done");
		
	}

	@Override
	public void stopPayment() {
		System.out.println(" you can stop the payment");
		
	
		
	}
	
}

class SBI implements Ipayment{

	@Override
	public void payment() {
		System.out.println("you can  make the payment  direct from your SBI Bank");
		
	}

	@Override
	public void stopPayment() {
		System.out.println(" you can stop the payment");
		
	}
	
}


class HDFC implements Ipayment{

	@Override
	public void payment() {
		System.out.println(" you can  make the payment direct from HDFC");
		
	}

	@Override
	public void stopPayment() {
		
		System.out.println(" you can stop the payment");
		
	}
	
}

class IDFC implements Ipayment{

	@Override
	public void payment() {
		System.out.println(" you can make the payment   direcr from IDFC bank");
		
	}

	@Override
	public void stopPayment() {
		System.out.println(" you can stop the payment");
		
	}
	
}

 class PNB implements Ipayment{

	@Override
	public void payment() {
		
		System.out.println(" you can  make the payment direct  from PNB bank");
		
	}

	@Override
	public void stopPayment() {
		System.out.println(" you can stop the payment");
		
	}
	 
 }
 class VCO implements Ipayment{

	@Override
	public void payment() {
		System.out.println(" you can make the payment from vco");
		
	}

	@Override
	public void stopPayment() {
		System.out.println(" you can stop the payment");
		
	}
	 
 }
 
  class RuralBank  implements  Ipayment{

	@Override
	public void payment() {
		
	}

	@Override
	public void stopPayment() {
		
	}
	  
  }

public class Driver {
 
}
