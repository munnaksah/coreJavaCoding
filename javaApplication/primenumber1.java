package javaApplication;

import java.util.Scanner;

public class primenumber1 {
	public static void main(String[]args) {
		System.out.println("enter number");
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int count =  0;
		
		
		
		for(int i = 1; i<=num;i++) {
			if(num % i==0) {
				count++;
				
			}
		}
		 if(count == 2) {
			 System.out.print("prime number :"+ num);
		 } else {
			 System.out.print(" not prime number :"+ num);
		 }
	}

}
