package com.rpoladia.thread.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService cachcedExecutor = Executors.newCachedThreadPool();
    }
}
