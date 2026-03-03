package com.kodawala.thread;
class MyTask extends Thread {

    @Override
    public  void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
