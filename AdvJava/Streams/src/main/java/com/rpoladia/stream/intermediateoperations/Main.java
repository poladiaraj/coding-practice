package com.rpoladia.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Pravin", "Ram");

        //1. filter()
        Stream<String> filterStream = list.stream().filter(x -> x.startsWith("A"));
        //No filtering at this point
        long result = filterStream.count();
        System.out.println("Filter - Count of names starting with 'A' : " + result);

        //2. map()
        Stream<String> mapStream = list.stream().map(String::toUpperCase);
        List<String> upperCaseList = mapStream.collect(Collectors.toList());
        System.out.println("Map - To upper case: " + upperCaseList);

        //3. sorted()
        Stream<String> sortedStream = list.stream().sorted();
        List<String> sortedList = sortedStream.collect(Collectors.toList());
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());
        List<String> sortedListUsingComparator = sortedStreamUsingComparator.collect(Collectors.toList());
        System.out.println("Sorted stream: " + sortedList);
        System.out.println("Sorted streamUsingComparator: " + sortedListUsingComparator);

        //4. distinct()
        Stream<String> distincStream = list.stream().filter(x -> x.startsWith("R")).distinct();
        List<String> distinctList = distincStream.collect(Collectors.toList());
        System.out.println("Distinct stream: " + distinctList);

        //5. limit()
        Stream<Integer> limitedStream = Stream.iterate(1, x -> x+1).limit(10);
        List<Integer> limitedList = limitedStream.collect(Collectors.toList());
        System.out.println("Limited stream: " + limitedList);

        //6. skip()
        Stream<Integer> skipStream = Stream.iterate(1, x -> x+1).skip(5).limit(10);
        List<Integer> skipList = skipStream.collect(Collectors.toList());
        System.out.println("Skip stream: " + skipList);

        //7. peek()
        //  This performs and action on each element as it is consumed.
        Stream.iterate(1, x -> x+1).skip(5).limit(10).peek(System.out::println).count();

        //8. flatMap
        // Handle streams of collections, lists or arrays where each element is itself a collection.
        // Flatten nested structures (e.g. lists within lists) so that they can be processed as a single sequence of elements.
        // Transform and flatten element at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("organge", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists
                .stream()
                .flatMap(x -> x.stream())
                .map(String::toUpperCase)
                .toList());

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful");

        System.out.println(sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList());
    }
}
