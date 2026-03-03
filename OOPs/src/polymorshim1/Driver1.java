package polymorshim1;

class Registration{
	
	public void doRegistration(int otp, String name) {
		System.out.println("Registrarion .doRegistration(int otp,String mobile)");
		
	}
	public void doRegistration(String pan,String password) {
		System.out.println("Registrarion .doRegistration(String pan,String password)");
		
	}
	
	public void doRegistration(String mobile,String adhar,int otp) {
		System.out.println("Registrarion .doRegistration(String mobile,String adhar, int otp)");
		
	}
	
}

public class Driver1 {
	public static void main(String[] args) {
		
		
		Registration reg = new Registration();
		reg.doRegistration(1234, "9082884519"); // which method to call compile time 
		
		reg.doRegistration("gmkps294q", "123445");
//		
//		reg.doRegistration("908345344", "5434883499484",10);
		
		
		
	}

}
