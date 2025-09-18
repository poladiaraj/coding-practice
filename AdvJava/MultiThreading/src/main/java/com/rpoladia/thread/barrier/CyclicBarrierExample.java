package com.rpoladia.thread.barrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numberOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfServices);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(numberOfServices, () -> System.out.println("CyclicBarrier is closed"));

        executor.submit(new DependentService(cyclicBarrier));
        executor.submit(new DependentService(cyclicBarrier));
        executor.submit(new DependentService(cyclicBarrier));

        cyclicBarrier.reset();

        System.out.println("Main");
        executor.shutdown();
    }
}
