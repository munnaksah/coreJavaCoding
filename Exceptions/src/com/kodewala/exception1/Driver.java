package com.kodewala.exception1;

public class Driver {
	public static void main(String[] args) {

		Registration reg = new Registration();
		try {
			reg.doRegistration("xyz@gmail.com");
		} catch (UserAlreadyRegisteredException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
