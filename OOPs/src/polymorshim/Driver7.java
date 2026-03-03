package polymorshim;


class Bank{
	public void doTransfer() {
		System.out.println("doing transfer");
	}
}


class MiniBank extends Bank{
	
	public void doTransfer() {
		System.out.println("saingAccount do transfer...");
	}
	
}

public class Driver7 {
	public static void main(String[] args) {
		Bank ac = new Bank();
	ac.doTransfer();
		
		
		
	}

}


