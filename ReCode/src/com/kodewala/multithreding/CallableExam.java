package com.kodewala.multithreding;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallableTask implements Callable<String> {

	public String call() throws InterruptedException {
		Thread.sleep(1000);
		return "Callable task completed by " + Thread.currentThread().getName();
	}

}

public class CallableExam {  
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future<String> future = executor.submit(new MyCallableTask());
		String result = future.get();
		System.out.println("result: "+ result);
		executor.shutdown();

	}

}
