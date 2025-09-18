package com.rpoladia.thread.communication;

public class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource sharedResource) {
        this.resource = sharedResource;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}
