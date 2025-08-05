package com.rpoladia.methodandconstructorref;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.forEach(x -> System.out.println(x));

        //Below is method reference
        list.forEach(System.out::println);

        //Below is constructor reference
        list.stream().map(Integer::new).forEach(System.out::println);
    }
}
