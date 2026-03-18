package com.kodawala.thread1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Task {
	ReentrantLock reentrantLock = new ReentrantLock();

	public void giveNumber() throws InterruptedException {

		reentrantLock.tryLock(500, TimeUnit.MILLISECONDS);

//		reentrantLock.lock();
		for (int i = 0; i < 5; i++) {

			System.out.println("give lock " + Thread.currentThread().getName());

		}
//		reentrantLock.unlock();

	}

}

class Worker extends Thread

{
	Task task;

	public Worker(Task task) {

		this.task = task;
	}

	@Override
	public void run() {
		try {
			task.giveNumber();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}

public class ManualLock {
	public static void main(String[] args) {
		Task task = new Task();

		Worker worker1 = new Worker(task);
		worker1.start();

		Worker worker2 = new Worker(task);
		worker2.start();

	}

}
