package com.kodewala.exception;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("START OF MAIN");

		try {
			String name = args[0]; //AIOBE
			name = null;
			int length = name.length();// this code is risky(may or may not throw exception)

			System.out.println("length is" + length);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("User failed to provide name!!");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("User name is null!!!");
		}
		System.out.println("END OF MAIN");
	}

}
