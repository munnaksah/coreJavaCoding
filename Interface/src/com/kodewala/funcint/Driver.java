package com.kodewala.funcint;
@FunctionalInterface
interface IPayment{
	
	// functional interface that means only one abstract method. 
	// always try to give functionalinterface anotation 
	public abstract void pay();// single Abstract method(Sam method)
	
	
	public  default void settle() {
		
	}
	
//	public void doWorking();
}

public class Driver {

}
