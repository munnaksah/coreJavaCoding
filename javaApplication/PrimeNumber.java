package javaApplication;

import java.util.Scanner;
// prime numbber 
public class PrimeNumber {
	
	public static void main (String[]args) {
		System.out.println("Enter number");
		Scanner sc =  new Scanner(System.in);
		int number =  sc.nextInt();
		int temp = 0;
		
		
		for(int i=2;i<=0;i++) {
			if(number%i==0) {
				temp =  temp+1;
				
			}
			
		}
		if(temp==0) {
			System.out.println(" prime number:" + number );
		}else {
			System.out.println(" not  prime number:" + number );
			
		}
		sc.close();
		
	}

}
