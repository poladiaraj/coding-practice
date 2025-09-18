package com.rpoladia.thread.synchronisation;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new MyThread(counter);
        Thread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}

        System.out.println(counter.getCount());
    }
}
