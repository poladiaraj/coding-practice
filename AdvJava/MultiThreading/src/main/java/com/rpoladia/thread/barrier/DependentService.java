package com.rpoladia.thread.barrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class DependentService implements Callable<String> {
    private final CyclicBarrier cyclicBarrier;

    public DependentService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " service started.");
        } finally {

        }
        return "ok";
    }
}
