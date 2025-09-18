package com.rpoladia.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a new thread");
        System.out.println(Thread.currentThread().getName());

        ExtendsThread t1 = new ExtendsThread();
        t1.start();

        Thread t2 = new Thread(new ImplementsRunnable());
        t2.start();

        for(int i=0; i<1000; i++) {
            System.out.println("Main Thread!");
        }
    }
}
