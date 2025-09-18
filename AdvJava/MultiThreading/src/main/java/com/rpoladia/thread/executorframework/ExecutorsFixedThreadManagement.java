package com.rpoladia.thread.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsFixedThreadManagement {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);

        for(int i=1; i<10; i++) {
            int finalI = i;

            Future<?> future = executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);

        System.out.println("Total time: " + (System.currentTimeMillis() - start));
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
