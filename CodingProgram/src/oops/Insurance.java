package oops;

// inheritance of examples 
 class InsuranceManagement extends Object{
//	 private int bonus = 12000;
	
	public void doInsurance() {
		System.out.println("InsuranceManagement.doInsurance..parent");
	}
	
	
}

public class Insurance extends InsuranceManagement {
	
	public static void main(String[] args) {
		Insurance insurance = new Insurance();
		insurance.doInsurance();
//		System.out.println(insurance.bonus);  we cant not access private variable in child class   
		
	}

}
