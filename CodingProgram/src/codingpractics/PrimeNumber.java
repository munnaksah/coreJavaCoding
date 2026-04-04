package codingpractics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your number");
		 int number =  sc.nextInt();
		 int count  = 0;
		 
		 
		 for(int i=1;i< number;i++) {
			 if(number%i==0) {
				 count++;
				 
			 }
			 
		 }
		 if(count==2) {
			 System.out.println("this is a prime number");
			 
		 } else {
			System.out.println(" this is not a primenumber");
		 }
	}

}
