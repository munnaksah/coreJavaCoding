package polymorshim;

public class PaymentProccesor {
	public static void main(String[] args) {
		PaymentProccesor paymentProccesor = new PaymentProccesor();
		NBPayment nb  = new NBPayment();
		nb.netBanking();
		
		
		
	
		
		CCPayment cc = new CCPayment();
		cc.pay();
		
		
		
	} 
	

}
