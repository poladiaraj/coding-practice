package com.rpoladia.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        //lock.lockInterruptibly() - this allows to interruptibly take the lock.
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entered outerMethod");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock(); //This will cause deadlock, but not with reentrant lock. Same thread can acquire the lock again.
        try {
            System.out.println(Thread.currentThread().getName() + " entered innerMethod");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
