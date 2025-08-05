package com.rpoladia.stream.terminaloperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5 , 6);

        //1. collect
        List<Integer> listOfIntegers =  list.stream().collect(Collectors.toList());
        System.out.println("List: " + listOfIntegers);
        //This required Java language level 16 and above
        List<Integer> immutableListOfIntegers = list.stream().toList();
        System.out.println("List: " + immutableListOfIntegers);

        //2. forEach
        list.stream().forEach(System.out::println);

        //3. reduce
        Optional<Integer> result = list.stream().reduce(Integer::sum);
        System.out.println("Sum: " + result.get());

        //4. count
        long count = list.stream().count();
        System.out.println("Count: " + count);

        //5. match:
        //  5.1. anyMatch
        boolean anyEvenNumber = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("anyMatch (x%2) : " + anyEvenNumber);
        //  5.2. allMatch
        boolean allGreaterThanZero = list.stream().allMatch(x -> x > 0);
        System.out.println("allGreaterThanZero: " + allGreaterThanZero);
        //  5.3. noneMatch
        boolean noneLessThanZero = list.stream().noneMatch(x -> x < 0);
        System.out.println("noneLessThanZero: " + noneLessThanZero);

        //6. find
        //  6.1. findFirst
        //  6.2. findAny
        System.out.println("findFirst: " + list.stream().findFirst().get());
        System.out.println("findAny: " + list.stream().findAny().get());

        //#NOTE:
        //  Find and Match methods are short-circuit operations. Once condition is satisfied the processing ends.

        //7. toArray
        Object[] array = Stream.of(1, 2, 3).toArray();

        //8. min/max
        System.out.println(Stream.of(2, 44, 69).max(Comparator.naturalOrder()).get());
        System.out.println(Stream.of(2, 44, 69).min(Comparator.naturalOrder()).get());

        //9. forEachOrdered
        // Especially while using Parallel Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Using forEach with parallel stream:");
        numbers.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream:");
        numbers.parallelStream().forEachOrdered(System.out::println);
    }
}
