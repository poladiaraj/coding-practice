package com.rpoladia.functionalinterface.biconsumer;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> printSum = (x, y) -> System.out.println(x+y);
        printSum.accept(1, 2);
    }
}
