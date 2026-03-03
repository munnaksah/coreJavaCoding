package com.kodawala.thread;


// producer nd consumer 


class Shared{
	int data;
	boolean  hasData = false;
	
	
	
	public synchronized  void produce(int value ) throws InterruptedException {
		while(hasData) {
			wait();
			
		}
		data = value;
		System.out.println(" Dataproduce" +data);
		hasData = true;
		notify();
	}
	
	
	public synchronized void consume() throws InterruptedException {
		while(!hasData) {
			wait();
			
		}
		
		System.out.println("DataConsume" + data);
		hasData = false;
		notify();
		
	}
}

class Produce extends Thread{
	Shared shared;

	public Produce(Shared shared) {
	
		this.shared = shared;
	}
	@Override
	public void run() {
		for(int i = 1;i<=3;i++) {
			try {
				shared.produce(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
		}
	}
	
}


class Consumer extends Thread{
	Shared shared;

	public Consumer(Shared shared) {
	
		this.shared = shared;
	}
	@Override
	public void run() {
		
		for(int i= 1;i<=3;i++) {
			
			try {
				shared.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}



public class Driver4 {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Produce produce = new Produce(shared); 
		Consumer consumer = new Consumer(shared);
		produce.start();
		consumer.start();
		
		
		
	}

}
