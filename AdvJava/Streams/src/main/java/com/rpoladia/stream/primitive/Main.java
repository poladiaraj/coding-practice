package com.rpoladia.stream.primitive;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        IntStream intStream = Arrays.stream(numbers);
        List<Integer> rangeList = IntStream.range(1,5).boxed().collect(Collectors.toList());
        System.out.println(rangeList);
        List<Integer> rangeListClosed = IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList());
        System.out.println(rangeListClosed);

        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.boxed().toList());

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().toList());

        ints = new Random().ints(5);
        System.out.println(ints.sum());
        //System.out.println(ints.min());
        //System.out.println(ints.max());
        //System.out.println(ints.average());
        //System.out.println(ints.summaryStatistics());

        doubles = new Random().doubles(5);
        System.out.println(doubles.mapToInt(x -> (int)x+1).boxed().toList());
    }
}
