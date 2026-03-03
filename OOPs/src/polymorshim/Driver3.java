package polymorshim;
// example of overriding
class Account {
	int interest;
	// 5%
	
	public void doTransfer(int interestRate) {
		System.out.println("doing fund transfer");  // fun1

  	}
	
	
}


class SavingAccount extends Account{
	//define your own functonality , method and variable.
	//you can reuse the exitsting functionality
	//you can override the  parrent class method as well
	//3%
	@Override
	public void doTransfer(int interestRate ) {
		
		System.out.println("savingAccount doing fund transfer ....");
	}
	
}


//class CurrentAccount extends Account{
//	//0%
//	
//	public void doTransfer() {
//		System.out.println("currentAccount doing transfer");
//	}
//	
//}

public class Driver3 {
	public static void main(String[] args) {
		
		
		
		SavingAccount sb  = new SavingAccount();
		sb.doTransfer(5);
		
	}

}
