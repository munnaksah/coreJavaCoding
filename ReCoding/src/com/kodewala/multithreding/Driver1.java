package com.kodewala.multithreding;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running :" + i + Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}

		}

	}

}

public class Driver1 {
	public static void main(String[] args) {
		MyThread1 mth = new MyThread1();
		Thread th1 = new Thread(mth);

		Thread th2 = new Thread(mth);
   
		th1.start();
		th2.start();

	}

}
