package ecompaymentpoly;


class Payment{
	
	public  void pay() {
		System.out.println("you can  pay your bill direct from Account");
		
	}

	
}



class CreditCard extends  Payment{
//	@Override
//	public  void pay() {
//		System.out.println("you can  pay your due bill from Account");
//		
//	}
	
	public void payCrediytCard() {
		System.out.println(" you can also use to creditcard to pay your bill");
	}
	
}

class Upi extends Payment{
	
	public void upi() {
		System.out.println("now you can use upi also for making the payment");
	}
	
}

class Wallet extends Payment {
	
	public void wallet() {
		System.out.println(" you  make the payment  using your wallet");
	}
	
}


public class Driver {
	
	public static void main(String[] args) {
//		Payment acc = new Payment();
//		acc.pay();
		Payment acc1 =  new CreditCard(); // runtime  polymorphism
		acc1.pay();
		
		
	
		
		
		
	}

}
