package com.kodawala.thread4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class OurTask implements Callable<Integer>{
	
	int numbers;
	
	
	public OurTask(int numbers) {
		this.numbers = numbers;
		
	}
	
	public  Integer call() throws Exception {
		return numbers;
		
	}
	
	
	
}

public class Driver1 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Callable<Integer> task1 = new  OurTask(20);
		Callable<Integer> task2 = new OurTask(30);
		
		Future<Integer> inte1 = service.submit(task1);
		
		Future<Integer> inte2 = service.submit(task2);
		
		int finalResult =  inte1.get()+inte2.get();
		
		System.out.println("give  final result "+ finalResult);
		
		service.shutdown();
		
		
		
	}

}
