package com.rpoladia.collectors.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Collecting names by length
        List<String> names = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        Map<Integer, List<String>> listByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("List by length: " + listByLength);

        //2. Counting word occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        //3. Partitioning even and odd numbers
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x%2 == 0)));

        //4. Summing values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        items.values().stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        //5. Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "banana", "orange", "apple");
        Map<String, Integer> words2Map = words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (a, b) -> a + b));
        System.out.println(words2Map);
    }
}
