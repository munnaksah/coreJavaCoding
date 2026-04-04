package string;

public class StringBuilEmail {
	public static void main(String[] args) {
		
	String firstName = "Munna";

  
    String orderNumber = "ORD12345";
    String status = "CONFIRMED";


	 
    StringBuilder sb = new StringBuilder();
			

        sb.append("Dear ")
               .append(firstName)
               .append(", ")
               .append("\n\n")
               .append("Thank you for reaching out. ")
               .append("Your order (")
               .append(orderNumber)
               .append(") has been successfully placed ")
               .append("and current status is : ")
               .append(status)
               .append("\n\n")
               .append("Regards\n")
               .append("Maveric Systems Limited");
		
		System.out.println(sb);
		
		

	}

}
