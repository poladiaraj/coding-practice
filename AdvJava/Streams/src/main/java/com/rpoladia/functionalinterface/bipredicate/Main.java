package com.rpoladia.functionalinterface.bipredicate;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x+y)%2 == 0;
        System.out.println(isSumEven.test(1, 3));
    }
}
