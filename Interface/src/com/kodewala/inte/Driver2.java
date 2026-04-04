package com.kodewala.inte;

interface NationalBank{
	
	public  static final int  LIMIT = 100;
	
	public abstract void payment();
	public  abstract void stopChque();
	
	public abstract void cancelTxn();
	public abstract void changeLimit();
	
}



class PNBBank implements  NationalBank{
	
	public void payment() {
		System.out.println(" you can do your payment here");
	}
	
	public void stopChque() {
		System.out.println("your chque is bounce  so we can stopYour Cheque");
	}
	
	public void cancelTxn() {
		System.out.println("you can cancel  your TXN");
	}
	
	
	

	@Override
	public void changeLimit() {
		if(100>LIMIT) {
			System.out.println("your limit is 100 , " + LIMIT);
			
		}else {
			System.out.println("your limit is exceed ");
		}
	
		
	}
	
}


class HDFCBank implements NationalBank{
	
	public void payment() {
		System.out.println(" you can do your payment here");
	}
	
	public void stopChque() {
		System.out.println("your chque is bounce  so we can stopYour Cheque");
	}
	
	public void cancelTxn() {
		System.out.println("you can cancel  your TXN");
	}
	
	
	public void changeLimit() {
		if(100>LIMIT) {
			System.out.println("your limit is 100 , " + LIMIT);
			
		}else {
			System.out.println("your limit is exceed ");
		}
	}
	
}

class KotakBank implements NationalBank{
	public void payment() {
		System.out.println(" you can do your payment here");
	}
	
	public void stopChque() {
		System.out.println("your chque is bounce  so we can stopYour Cheque");
	}
	
	public void cancelTxn() {
		System.out.println("you can cancel  your TXN");
	}
	
	

	@Override
	public void changeLimit() {
		if(100>LIMIT) {
			System.out.println("your limit is 100 , " + LIMIT);
			
		}else {
			System.out.println("your limit is exceed ");
		}
		
	}
	
	
}
public class Driver2 {
	public static void main(String[] args) {
		
		NationalBank nb = new  PNBBank();
		nb.payment();
		nb.cancelTxn();
		nb.changeLimit();
		nb.stopChque();
	
		
		NationalBank nb1  = new HDFCBank();
		nb1.payment();
		nb1.cancelTxn();
		nb1.changeLimit();
		nb1.stopChque();
		
		
		
		NationalBank nb2 =  new KotakBank();
		nb2.payment();
		
		
		
		
		
		
	}

}
