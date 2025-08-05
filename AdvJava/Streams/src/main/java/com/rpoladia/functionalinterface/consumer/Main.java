package com.rpoladia.functionalinterface.consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(1);
        consumer.andThen(consumer).accept(2);
    }
}
