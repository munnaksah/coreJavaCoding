package codingpractics;

import java.util.Scanner;

public class Code9 {
	public static void main(String[] args) {
		 int userGues = 0;
		 int expectedNumber = 9;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 while(userGues != expectedNumber ) {
			 userGues = sc.nextInt();
			 
			 
			 
			 if(userGues == expectedNumber ) {
				 System.out.println("Congratulations! you hues the correct number .");
				 
			 }  else {
				 System.out.println("Bad Luck! try again ");
			 }
			 
		 }
		 sc.close();
		 
	}

}
