package com.rpoladia.stream.creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //1. From collections
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream1 = list.stream();

        //2. From Arrays
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(arr);

        //3. Using Stream.of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //4. Infinite streams:
        //  4.1. Stream.generate()
        //  4.2. Stream.iterate()
        Stream<Integer> stream4 = Stream.generate(() -> 1);
        Stream<Integer> stream5 = Stream.iterate(1, x -> x+1);

        //Dont' want infinite? Then use limit
        Stream<Integer> stream6 = Stream.generate(() -> 2).limit(3);
        Stream<Integer> stream7 = Stream.iterate(1, x -> x+1).limit(3);

    }
}
