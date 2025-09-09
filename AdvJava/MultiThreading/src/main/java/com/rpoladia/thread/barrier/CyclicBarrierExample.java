package com.rpoladia.thread.latch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numberOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfServices);


    }
}
