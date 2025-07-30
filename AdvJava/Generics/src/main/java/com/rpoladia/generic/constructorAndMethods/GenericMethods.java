package com.rpoladia.generic.constructorAndMethods;

public class GenericMethods {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T, P> void printArray(T[] array, P[] array2) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (P element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
