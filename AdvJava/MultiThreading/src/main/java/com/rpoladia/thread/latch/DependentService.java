package com.rpoladia.thread.latch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class DependentService implements Callable<String> {
    private final CountDownLatch countDownLatch;

    public DependentService(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " service started.");
        } finally {
            countDownLatch.countDown();
        }
        return "ok";
    }
}


