package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver5 {
	int addNumber;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Registration reg = new Registration();

		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) // try with resourse
		{
			reg.doRegistration("xyz@gmail.com");
		} catch (UserAlreadyRegisterException e) {
			System.out.println(e.getMessage());
			System.out.println("USer already registered:");
			e.printStackTrace();
		}

	}

	public static int addNumber() {
		try {
			return 100;
		} catch (Exception e) {

		} finally {
			return 5;
		}
	}

}
