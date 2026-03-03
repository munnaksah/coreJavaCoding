package polymorshim;






class Customer{
	
	public void buy() {
		System.out.println("customer.buy");
	}
	
}



class GoldCustomer extends Customer{
	
	public void buy() {
		System.out.println("goldcustomer.buy");
	}
	
}
public class Driver1 {
	public static void main(String[] args) {
		
		GoldCustomer gd  = new GoldCustomer();
		gd.buy(); // 
		
		Customer cd = new GoldCustomer();
		cd.buy();
		
		
		
	}

}
