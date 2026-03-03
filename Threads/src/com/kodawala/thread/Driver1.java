package com.kodawala.thread;
// block synchronized
class Task {

    public static void doTask() {

        for (int i = 0; i < 5; i++) {

            synchronized (Task.class) {

                System.out.println("Doing task!! " + Thread.currentThread().getName());
                System.out.println("Updating some variable.... " + Thread.currentThread().getName());

            }
        }
    }
}  
  

class Worker extends Thread {

     Task task;

    public Worker(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        Task.doTask();   
    }
}


public class Driver1 {

    public static void main(String[] args) {

        Task task = new Task();

        Worker worker1 = new Worker(task);  
        worker1.setName("worker1");
        worker1.start();

        Worker worker2 = new Worker(task);
        worker2.setName("worker2");
        worker2.start();
    }
}
