package com.kodawala.thread;

class Tasks{
	int data;
	boolean hasData  = false;
	
	
	public synchronized void producer(int value) throws InterruptedException {
		while(hasData) {
			wait();
			
		}
		
		data = value; // produced data
		System.out.println("Data produced: "+data);
		hasData = true;
		notify(); // notify consumer
		
	}
	

	public synchronized void consumer(int value) throws InterruptedException {
		while(!hasData) {
			wait();
			
		}
		
		data = value; // produced data
		System.out.println("Data consume: "+data);
		hasData = false;
		notify(); // notify producer
		
	}
}

class ProduceThread extends Thread{
	Tasks task;
	public ProduceThread(Task task2) {
		super();
//		this.task = task2;
	}

	
	
}

class ConsumeThread extends Thread{
	
	Task task ;

	public ConsumeThread(Task task) {
		super();
		this.task = task;
	}
	
}


public class Driver2 {
	public static void main(String[] args) {
		Task task = new Task();
		
		ProduceThread pt = new ProduceThread(task);
		pt.setName("produced data");
		pt.start();
		
		
		
		
		ConsumeThread ct = new ConsumeThread(task);
		ct.setName("consume data");
		ct.start();
		
		
	}
	

}
