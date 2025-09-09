package com.rpoladia.thread.executorframework;

public class ManualThreadManagement {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for(int i=1; i<10; i++) {
            //System.out.println(factorial(i));
            int finalI = i; //This is required as the lambda requires final values.
            threads[i-1] = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
            threads[i-1].start();
        }

        for(int i=1; i<10; i++) {
            try {
                threads[i-1].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

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
