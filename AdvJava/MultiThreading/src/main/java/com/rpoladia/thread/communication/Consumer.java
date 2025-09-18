package com.rpoladia.thread.communication;

public class Consumer implements Runnable {
    private SharedResource resouce;

    public Consumer(SharedResource resouce) {
        this.resouce = resouce;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            int value = resouce.consume();
        }
    }
}
