package com.rpoladia.thread.barrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

public class DependentService implements Callable<String> {
    private final CyclicBarrier cyclicBarrier;

    public DependentService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        cyclicBarrier.await();

        return "ok";
    }
}
