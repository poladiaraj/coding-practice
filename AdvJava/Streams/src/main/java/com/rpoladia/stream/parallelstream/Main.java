package com.rpoladia.stream.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(0, i -> i + 1).limit(20000).toList();

        long start = System.currentTimeMillis();
        List<Long> factorials = numbers.stream().map(Main::factorial).toList();
        long end = System.currentTimeMillis();
        System.out.println("Time taken with stream: " + (end-start) + "ms");

        start = System.currentTimeMillis();
        factorials = numbers.parallelStream().map(Main::factorial).toList();
        end = System.currentTimeMillis();
        System.out.println("Time taken with parallelStream: " + (end-start) + "ms");

        //Cumulative Sum using parallel stream (not recommended as tasks are dependent).
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        AtomicInteger sum = new AtomicInteger();
        List<Integer> sumListParallelStream = numbers.parallelStream().map(sum::addAndGet).toList();
        System.out.println(sumListParallelStream);
        System.out.println(sum.get());

        sum.set(0);
        //Converting parallel stream to a sequential stream
        List<Integer> sumListParallelStreamSeq = numbers.parallelStream().map(sum::addAndGet).sequential().toList();
        System.out.println(sumListParallelStreamSeq);
        System.out.println(sum.get());

        sum.set(0);
        //Cumulative Sum using regular stream (recommended, as tasks are dependent).
        List<Integer> sumList = numbers.stream().map(sum::addAndGet).toList();
        System.out.println(sumList);
        System.out.println(sum.get());
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
