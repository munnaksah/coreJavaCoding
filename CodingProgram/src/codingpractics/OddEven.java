package codingpractics;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter your number");
		
		
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("this is even number");
			
		}else {
			System.out.println("this is odd number");
		}
	}

}
