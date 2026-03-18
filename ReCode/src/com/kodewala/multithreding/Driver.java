package com.kodewala.multithreding;
// thread is lightweight subprocess .  it is a unit of execution within a process./

// in java , every program has at least one thread : the main thread
//java support multithreading which means executing multiple thread in parallel.
//     

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("thread is running:" + Thread.currentThread().getName());

		}
	}
}

public class Driver {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();

		MyThread mt2 = new MyThread();

		mt1.start();
		mt2.start();

	}

}
