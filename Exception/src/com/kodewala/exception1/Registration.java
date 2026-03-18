package com.kodewala.exception1;
// throw - throw create new  object 

public class Registration {
	
	
	 public void doRegistration(String email) throws UserAlreadyRegisteredException{
		  
		 boolean isExits = true;
		 
		 if(isExits) {
			 
			 throw new UserAlreadyRegisteredException("User is already Registered," + email);
			 
		 }else {
			 System.out.println("Registering the user," + email);
		 }
		
	}

}
