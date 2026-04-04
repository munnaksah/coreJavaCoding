package codingpractics;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 String  original  = sc.nextLine();
		 String reversed =  "";
		 
		 
		 for(int i = original.length()-1; i>=0; i--) {
			 reversed = reversed + original.charAt(i);
			 
			 
		 }
		 
		 if(original.equals(reversed)) {
			 System.out.println("this is palindrome number:" + original);
			 
		 } else {
			 System.out.println("this is not a palindrome ");
		 }
		 sc.close();
		 
		 
	}

}
