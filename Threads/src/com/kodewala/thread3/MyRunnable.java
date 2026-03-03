package com.kodewala.thread3;

public class MyRunnable implements Runnable {
	// interface
	// run method
	// no throw exception 
	// no return 

	@Override
	public void run() {
		System.out.println("Thread  is runing "+ Thread.currentThread().getName());
		
		
	}
	 public static void main(String[] args) {
		 MyRunnable mr = new MyRunnable();
		 Thread t1  =  new Thread(mr);
	t1.start();
		
	}

}
