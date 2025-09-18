package com.rpoladia.thread.lock.fairness;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {
    private final Lock fairLock = new ReentrantLock(true);

    public void accessResource() {
        fairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            fairLock.unlock();
            System.out.println(Thread.currentThread().getName() + " released the lock.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FairLockExample example = new FairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        //Thread.sleep(50);
        t2.start();
        //Thread.sleep(50);
        t3.start();
    }
}
