package com.kodewala.inf.marker;
// clonable- copy object (photo copy)
class Account  implements Cloneable{
	
	public String name ;
	public Account(String name) {
		this.name = name;
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Driver1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	
	Account acc1  =  new Account ("munna");
	Account acc2 =  (Account) acc1.clone(); // clone object 
	
	
	
	System.out.println(acc2.name);
	
	
	}
	

}
