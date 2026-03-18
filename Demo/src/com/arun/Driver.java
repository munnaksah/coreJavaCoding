package com.arun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		//  try with resources that means  autoClosable
		try(FileInputStream fis = new FileInputStream("test.txt")){
			System.out.println("file open");
			
		} {
			
		}
		
	}
	

}
