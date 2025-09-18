package com.rpoladia.thread;

public class ThreadMethods extends Thread {

    public ThreadMethods(String name) {
        super(name);
    }

    public void run() {
        System.out.println("ThreadMethods run");
        for(int i=1; i<=10; i++) {
            System.out.println("Thread Name: " + Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            Thread.yield();
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

        System.out.println("ThreadMethods end");
    }

    public static void main(String[] args) throws InterruptedException {
        /*
        ThreadMethods t1 = new ThreadMethods("T1");
        ThreadMethods t2 = new ThreadMethods("T2");
        ThreadMethods t3 = new ThreadMethods("T3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        ThreadMethods threadMethods = new ThreadMethods("ThreadMethods");
        threadMethods.start();
        threadMethods.interrupt();
        threadMethods.join();
        */

        ThreadMethods daemonThread = new ThreadMethods("Daemon Thread");
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Main thread exit");
    }
}
