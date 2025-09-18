package com.rpoladia.thread.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(() -> System.out.println("Runnable"));

        System.out.println(future.get());
        System.out.println(future.isDone());

        //submit() with Callable
        Future<String>  future2 = executor.submit(() -> "Callable");
        System.out.println(future2.get());

        //submit() with Runnable and result Type
        Future<String> future3 = executor.submit(() -> System.out.println("Runnable plus Type"), "success");
        System.out.println(future3.get());

        //executor.invokeAll();
    }
}
