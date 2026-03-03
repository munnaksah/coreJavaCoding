package polymorshim;

// overriding
class Banking{
	public int calculateInterest(int amount) {
		System.out.println("Banking.calculatedInterest()");
		int  interest = (amount * 5)/100;
		return interest;
		
	}

}

class SBI  extends Banking {
	@Override // this anotation will check all the rules of overriding or not
	public int calculateInterest(int amount) {
		System.out.println("sbi.calculatedInterest()");
		int  interest = (amount * 4)/100;
		return interest;
		
	}
	
	
}


public class Driver {
	public static void main(String[] args) {
		SBI sbi =  new SBI();
		int interest = sbi.calculateInterest(2000);
		System.out.println("interest is "+ interest);
		
	}

}
