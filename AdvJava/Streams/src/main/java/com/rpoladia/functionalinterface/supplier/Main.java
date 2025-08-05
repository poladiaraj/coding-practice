package com.rpoladia.functionalinterface.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World!";

        System.out.println(supplier.get());
    }
}
