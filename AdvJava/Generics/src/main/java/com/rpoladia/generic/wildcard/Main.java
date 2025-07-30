package com.rpoladia.generic.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        //Wild card basic
        printAll(list);

        //Wild card won't work in case method returns something
        int first = readFirst(list);
        System.out.println("First: " + first);

        //Upper Bound
        double sum = sum(list);
        System.out.println("Sum: " + sum);

        //Lower Bound
        printAll(list);

        //Upper Bound example
        List<? extends Number> list2 = Arrays.asList(1, 2, 3, 4, 5);
        list2.add(null); //This can be done.
        //list2.add(6); //This cannot be done.

        //Lower Bound example
        List<? super Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        list3.add(null); //This can be done.
        list3.add(6); //This can also be done in case of Lower Bound.

    }

    public static void printAll(ArrayList<?> list) {
        for(Object o : list) {
            System.out.println(o);
        }
    }

    public static <T> T readFirst(ArrayList<T> list) {
        return list.get(0);
    }

    //Upper bound
    public static double sum(ArrayList<? extends Number> numbers) {
        double sum = 0;
        for(Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    //Lower bound
    public static void print(ArrayList<? super Number> numbers) {
        for(Object number : numbers) {
            System.out.println(number);
        }
    }
}
