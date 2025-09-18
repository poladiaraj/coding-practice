package com.rpoladia.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;

    private final Lock lock = new ReentrantLock();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    /* Implicit Lock Example
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else  {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
    */

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        //lock.lock() - Similar to synchronized keyword

        //tryLock()
        /*
        if(lock.tryLock()) {

        }
        */

        //tryLock(time) - This requires try/catch or throws in the method signature
        try {
            if(lock.tryLock(4000, TimeUnit.MILLISECONDS)) {
                if(balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (InterruptedException e) {
                        //throw new RuntimeException(e);
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else  {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            Thread.currentThread().interrupt();
        }

        if(Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
    }
}
