package com.rpoladia.functionalinterface.bifunction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> subAsString = (x, y) -> Integer.toString(x+y);
        System.out.println("Sum as String: " + subAsString.apply(1,2));
    }
}
