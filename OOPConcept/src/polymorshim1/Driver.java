package polymorshim1;

class Account{
	public Account createAccount(String name) {
		System.out.println("doing transfernow.....");
		return new Account();
	}
}


class SavingAccount extends Account{
	
	public SavingAccount createSavingAccount(String name) {
		System.out.println("saving acocount is transfer");
		return new  SavingAccount();
		// corvirient  - if the parent class 
	
	}
	
}

public class Driver {
	public static void main(String[] args) {
		
		SavingAccount sv = new SavingAccount();
		sv.createAccount("munna");
	}

}
