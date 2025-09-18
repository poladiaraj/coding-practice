package com.rpoladia.thread.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {

            }

            return "Hello World";
        });
        //completableFuture.get();
        System.out.println(completableFuture.getNow("getNow"));

        Thread.sleep(5000);
        System.out.println("Main");

    }
}
