package com.kodewala.polymorphism;
// overloading - compiletime polymorphism

// we have created more than a methode with same name in the same class but the numbers of paramiters nd numbers of arguments are diffrent.

class Registration {

	void doRegistration(String adhar) {
		System.out.println("Registration using Adhar:" + adhar);
	}

// different number of parameters 
	void doRegistration(String mobile, int otp) {
		System.out.println("Registration using mobile:" + mobile + " with OTP:" + otp);
	}
	

	// different number of parameters 
		void doRegistration(String mobile, int otp,String name) {
			System.out.println("Registration using mobile:" + mobile + " with OTP:" + otp);
		}

// different types of parameter
	void doRegistration(String name, String email) {
		System.out.println("Registration using name:" + name + "and email:" + email);

	}

// diffrent order of parameter
	void doRegistration(int otp, String name) {
		System.out.println("Registration using otp:" + otp + " and name:" + name);

	}

}

public class Driver {
	public static void main(String[] args) {

		Registration reg = new Registration();
		reg.doRegistration("643389322155");
		reg.doRegistration("8936948654", 1230);
		reg.doRegistration("munna", "msah@1gmail.com");
		reg.doRegistration(5431, "mannu");

	}

}
