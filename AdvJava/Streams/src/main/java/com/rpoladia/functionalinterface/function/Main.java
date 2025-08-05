package com.rpoladia.functionalinterface.function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x -> 2*x;
        Function<Integer, Integer> tripleIt = x -> 3*x;

        System.out.println("Input value: " + 20);
        System.out.println("doubleIt.apply(): " + doubleIt.apply(20));
        System.out.println("doubleIt.andThen(tripleIt).apply(): " + doubleIt.andThen(tripleIt).apply(20));
        System.out.println("doubleIt.compose(tripleIt).apply(): " + doubleIt.compose(tripleIt).apply(20));

        Function<Integer, Integer> identity = Function.identity();
        System.out.println("identity: " + identity.apply(20));
    }
}
