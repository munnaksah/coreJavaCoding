package abstraction;

interface Ipayment {
	public abstract void pay1(int amount, String accNo); // what to do
	
	public abstract void stopPayment(int paymentId);
	

	 
}

class Payment implements Ipayment {
	@Override
	public void pay1(int amount, String accNo) { // exposing what are doing
		dbConnect(); // hiding how we are doing
		validateUser();
		checkBanlance();
		checkLimit();
		doTxn();

	}

	// connect to dsatabase
	private void dbConnect() {
		System.out.println("successfully conected to db");

	}

	// validate userid
	private void validateUser() {

	}

	// check balance
	private void checkBanlance() {

	}

	// check daily linit
	private void checkLimit() {

	}

	// do transaction
	private void doTxn() {

	}

	

	@Override
	public void stopPayment(int paymentId) {
		// TODO Auto-generated method stub
		
	}

}

public class Driver {
	public static void main(String[] args) {
		Ipayment ip = new Payment();

		
		
	}

}
