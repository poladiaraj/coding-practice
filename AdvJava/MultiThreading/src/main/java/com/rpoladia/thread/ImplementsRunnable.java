package com.rpoladia.thread;

public class ImplementsRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            System.out.println("Implements Runnable!");
        }
    }
}
