package com.kodewala.multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExam {
	
	public static void main(String[] args) {
		
		ExecutorService  executor = Executors.newFixedThreadPool(2);
		
		for(int i =0; i<5;i++) {
			executor.execute(new Task1());
			executor.execute(new Task2());
			
			
		}
		
		executor.shutdown();
	}

}
