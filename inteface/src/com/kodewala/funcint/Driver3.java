package com.kodewala.funcint;
@FunctionalInterface
interface Cal{
	
	public abstract int  doCalcule(int x,int y );
	
	
}

public class Driver3 {
	public static void main(String[] args) {
		
		Cal cal = (x,y) ->  x-y;
				System.out.println(cal.doCalcule(55,20));

	}
	

}
