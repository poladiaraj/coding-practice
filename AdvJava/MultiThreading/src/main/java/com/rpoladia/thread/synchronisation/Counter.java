package com.rpoladia.thread.synchronisation;

public class Counter {
    private int count = 0;

    //synchronised method
    /*
    public synchronized void increment() {
        count++;
    }
    */

    //synchronised lock on instance.
    //If this instance is accessed by multiple threads, then this block is accessible by 1 thread at a time.
    public void increment() {
        synchronized (this) {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}
