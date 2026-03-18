package com.kodewala.exception;

public class Registration {
	
	public void doRegistration(String email) throws UserAlreadyRegisterException {
		
		
		boolean isExit =  true;
		if(isExit){
			
			throw new UserAlreadyRegisterException(" User is already registered"+email);
			
		
		}else {
			//register this user
			
			System.out.println("Registering the user,"+ email);
			
		}
			
		}
	}


