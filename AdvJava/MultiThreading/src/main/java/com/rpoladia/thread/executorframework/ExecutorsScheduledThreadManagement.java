package com.rpoladia.thread.executorframework;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorsScheduledThreadManagement {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(1);

//        scheduler.schedule(() -> System.out.println("Task executed after 5 second delay !"),
//                5,
//                TimeUnit.SECONDS);
//        scheduler.shutdown();

        scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed at 1 second interval after 1 second delay !"),
                1,
                1,
                TimeUnit.SECONDS);

        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Task executed with fixed delay of 1 second after 1 second delay !");
        }, 1, 1, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
