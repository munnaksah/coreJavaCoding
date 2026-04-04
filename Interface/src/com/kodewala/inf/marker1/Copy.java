package com.kodewala.inf.marker1;

public class Copy {
	
	
	public void copyDocument(Object o) {
		
		if(o instanceof Copyable) {
			
			System.out.println("Allow to copy !!!");
			
		} else {
			
			// throw CopyNotSuuportedException
			System.err.println("CopyNotSuuportedException.......!!!");
		}
	}

}
