package com.kodewala.exception;
// custom exception
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
	
}

public class Diver1 {
	
	public static void main(String[] args)  {
		try {
		checkAge(19);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void checkAge(int age)  throws InvalidAgeException{
		
		if(age<18) {
			throw new  InvalidAgeException("you are not eligible  for vote");
			
		}else {
			System.out.println("  now you  are eligible for vote");
		}
		
		
	}

}
