package com.rpoladia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println( "Hello World from thread!" );
        });

        t1.start();
        Thread.currentThread().sleep(100);
        System.out.println( "Hello World!" );

    }
}
