package com.rpoladia.thread.latch;

import java.util.concurrent.*;

public class CountDownLatchMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        /*
        Future<String> future1 = executorService.submit(new DependentService());
        Future<String> future2 = executorService.submit(new DependentService());
        Future<String> future3 = executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();
        */

        CountDownLatch latch = new CountDownLatch(numberOfServices);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        //latch.await();
        latch.await(1, TimeUnit.SECONDS);

        System.out.println("All dependent services finished. Starting main service...");
        executorService.shutdown();
        //executorService.shutdownNow();
    }
}
