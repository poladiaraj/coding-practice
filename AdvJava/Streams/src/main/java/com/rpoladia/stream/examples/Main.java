package com.rpoladia.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1. Filtering and Collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        //2. Squareing and Sorting numbers
        List<Integer> numbers = Arrays.asList(3, 1, 5, 2, 4);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());

        //3. Summing values
        System.out.println(numbers.stream().reduce(Integer::sum).get());

        //4. Counting Occurrences of a Character
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        //5.
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        List<String> listOfNames = stream.map(String::toUpperCase).toList();
    }
}
