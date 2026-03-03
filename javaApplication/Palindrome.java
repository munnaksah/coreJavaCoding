package javaApplication;

import java.util.Scanner;

public class Palindrome {
	public static void main(String []args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.print("enter number ");
		int original =  sc.nextInt();
		int number =  original;
		int reversed =  0;
		
		
		
		
		while(number>0) {
			
			 int digit =  number%10;
			 reversed =  reversed*10+digit;
			 number = number/10;
		}
		
		if(original== reversed) {
			System.out.println(original + "palindrome number");
		}else {
			System.out.println(original + " not palindrome number");
		}
		
	}

}
