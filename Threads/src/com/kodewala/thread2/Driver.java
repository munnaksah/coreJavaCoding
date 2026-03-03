package com.kodewala.thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String>{
	int  taskId;

	public Task(int taskId) {
	
		this.taskId = taskId;
	}
	
	
	
	
	
	@Override
	public String call() {
		String name = "kodewala";
		name = name.toUpperCase();
		System.out.println(name);
		System.out.println("Task run(). task id "+ Thread.currentThread().getName());
		return name;
		
	}
	

	
	


	
}


public class Driver {
	public static void main(String[] args) {
		ExecutorService service  = Executors.newFixedThreadPool(3);
		for(int i = 0; i<3;i++) {
			Future<String> future = service.submit(new Task(i));
			service.submit(new Task(i));
		}
		service.shutdown();
	}

}
