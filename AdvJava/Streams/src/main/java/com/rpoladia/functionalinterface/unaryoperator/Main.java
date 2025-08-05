package com.rpoladia.functionalinterface.unaryoperator;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> doubleIt = x -> x*2;

        System.out.println(doubleIt.apply(2));
    }
}
