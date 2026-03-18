package com.kodewala.exception;

public class Driver3 {
	public static void main(String[] args) {

		try {
			String name = args[0]; //AIOBE
			name = null;
			int length = name.length();// this code is risky(may or may not throw exception)

			System.out.println("length is" + length);
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unknown error!!");
//		} catch (NullPointerException e) { // it will give unreacheble code bcz Exception already handle
//			e.printStackTrace();
//			System.out.println("User name is null!!!");
//		}
		System.out.println("END OF MAIN");
	}

}
}
	
