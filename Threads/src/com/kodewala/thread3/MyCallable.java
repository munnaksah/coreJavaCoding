package com.kodewala.thread3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable  implements Callable<Integer>{



@Override
public Integer call() throws Exception {
	
	return 50+60;
}

public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService executor = Executors.newCachedThreadPool();
	
	MyCallable mc = new MyCallable();
	Future<Integer> future =executor.submit(mc);
	Integer result  = future.get();
	System.out.println("give me output" + result);
	executor.shutdown();
	
}



}
