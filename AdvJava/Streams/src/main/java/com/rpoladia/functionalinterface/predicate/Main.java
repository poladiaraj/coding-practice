package com.rpoladia.functionalinterface.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        /*
            List of all the methods/operations on Predicate:
                1. test()
                2. and()
                3. or()
                4. not()
                5. negate()
                6. isEqual()
         */

        //Storing a condition in a variable
        Predicate<Integer> condition = x -> x%2==0;
        System.out.println(" Is number 9 even? -> " + condition.test(9));
        System.out.println(" Is number 18 even? -> " + condition.test(18));

        Predicate<String> isWordStartingWithA = x -> x.toUpperCase().startsWith("A");
        Predicate<String> isWordEndingWithB = x -> x.toUpperCase().endsWith("B");

        System.out.println("Word 'Arab' starting with A and ending with B?: " + isWordStartingWithA.and(isWordEndingWithB).test("Arab"));
    }
}
