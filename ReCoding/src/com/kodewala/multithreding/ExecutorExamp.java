package com.kodewala.multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExamp {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(10); 
		executor.submit(()->{
			System.out.println("Task1 is runing :"+ Thread.currentThread().getName());
		});
		
		executor.submit(()->{
			System.out.println("Taks2 is running :"+ Thread.currentThread().getName());
			
		});
		executor.submit(()->{
			System.out.println("task3 is running :" +  Thread.currentThread().getName());
		
		});
		executor.submit(()->{
			System.out.println("task4 is running :" +  Thread.currentThread().getName());
		
		});
		executor.submit(()->{
			System.out.println("task5 is running :" +  Thread.currentThread().getName());
		
		});
		executor.submit(()->{
			System.out.println("task6 is running :" +  Thread.currentThread().getName());
		
		});
		executor.submit(()->{
			System.out.println("task7 is running :" +  Thread.currentThread().getName());
		
		});
		executor.submit(()->{
			System.out.println("task8 is running :" +  Thread.currentThread().getName());
		
		});
		executor.submit(()->{
			System.out.println("task9 is running :" +  Thread.currentThread().getName());
		
		});
		executor.submit(()->{
			System.out.println("task10 is running :" +  Thread.currentThread().getName());
		
		});
		
		executor.shutdown();
		
		
		
	}
	

}
