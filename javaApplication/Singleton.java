package javaApplication;

public class Singleton {

	private static  Singleton Instance;
	
	private Singleton() {
		System.out.println("hello from singleton");
		
	}
	
	public static Singleton getInstance() {
		if(null== Instance) {
			Instance =  new Singleton();
		}
		return Instance;
	}
	
	public void showMessage() {
		System.out.println("create singleton");
	}
	
	
	public static void main(String[]args) {
		Singleton obj1 =  Singleton.getInstance();
		Singleton obj2 =  Singleton.getInstance();
		
		obj1.showMessage();
		System.out.println(obj1== obj2);
		
	}
	
}
