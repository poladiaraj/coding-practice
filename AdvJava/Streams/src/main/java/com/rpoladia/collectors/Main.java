package com.rpoladia.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "Daniel", "Eve");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        //2. Collecting to a Set
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6);
        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
        System.out.println(numberSet);

        //3. Collecting to a Specific Collection
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(ArrayDeque::new));

        //4. Joining Strings
        String concatNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatNames);

        //5. Summarizing Data
        //  Generics statistical summary (count, sum, min , average, max
        List<Integer> nums = Arrays.asList(2, 3, 5, 7, 11);
        System.out.println("List form IntSummaryStatistics: " + nums);
        IntSummaryStatistics stats = nums.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Avg: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        //6. Calculating Averages
        Double avg = nums.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);

        //7. Counting Elements
        Long count = nums.stream().collect(Collectors.counting());
        System.out.println(count);

        //8. Grouping Elements
        List<String> words = Arrays.asList("One",  "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        //9. Partitioning Elements
        // Partitions elements into two groups (true and false) based on a predicate.
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length()>4)));
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length()>4, Collectors.counting())));

        //10. Mapping and Collecting
        // Applies a mapping function before collecting.
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        //11. toMap
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "banana", "orange", "apple");
        Map<String, Integer> words2Map = words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (a, b) -> a + b));
        System.out.println(words2Map);
    }
}
