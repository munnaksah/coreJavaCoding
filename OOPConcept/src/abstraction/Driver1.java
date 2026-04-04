package abstraction;
// example of interface  
 interface BankAccount{
	 
	public static final double MIN_BALANCE = 2000;
	
	 public abstract void deposite(double amount);
	 public abstract void withdraw(double amount);
	 public abstract double checkBalance();
	
}
 
 class SavingAccount implements BankAccount{
	 
	 private double balance;
	 
	 public SavingAccount(double balance) {
		 this.balance = balance;
		 
	 }
	 

	@Override
	public void deposite(double amount) {
		balance += amount;
	  System.out.println("Deposited " + amount + " in saving Account. New Balance: " + balance);
		
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance-amount>= MIN_BALANCE) {
			balance-= amount;
			System.out.println("Withdraw " + amount + " in Saving Account.New Balance: " + balance);
				
		} else {
			System.out.println("Insufficient balance");
		}
		
	}

	@Override
	public double checkBalance() {
		return balance;
		
		
	}
	 
 }
 
 class CurrentAccount implements  BankAccount{
	 private double balance;
	 
	 public CurrentAccount( double balance) {
		 this.balance = balance;
	 }

	@Override
	public void deposite(double amount) {
		balance += amount;
		System.out.println("Deposite " + amount + " in  CurrentAccount . new Balance " + balance);
	
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance-amount>=MIN_BALANCE) {
			balance-= amount;
			System.out.println("Withdraw " + amount + " in CurrentAccount .New Balance " + balance);
			
		} else {
			System.out.println("insufficient  balance");
		}
		
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

	
	 
 }
 

public class Driver1 {
	public static void main(String[] args) {
		
		BankAccount ca = new CurrentAccount(400);  
		ca.deposite(400);
		ca.deposite(200);
		ca.withdraw(300);
		
		
	}
 
}
