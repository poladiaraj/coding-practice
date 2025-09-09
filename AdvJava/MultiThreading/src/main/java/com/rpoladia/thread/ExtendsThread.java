package com.rpoladia.thread;

public class ExtendsThreadClass extends Thread {
    public void run() {
        for(int i=0; i<10000000; i++) {
            System.out.println("Extends Thread!");
        }
    }
}
