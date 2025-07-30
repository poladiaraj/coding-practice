package com.rpoladia.generic.constructorAndMethods;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply (T a, T b) {
        switch (this) {
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            default:
                return 0;
        }
    }
}

public class GenericMethodsWithEnum {
    public static void main(String[] args) {
        double result = Operation.ADD.apply(10, 20);
        System.out.println("ADD: " + result);
        result = Operation.SUBTRACT.apply(10, 20);
        System.out.println("SUBTRACT: " + result);
        result = Operation.MULTIPLY.apply(10, 20);
        System.out.println("MULTIPLY: " + result);
        result = Operation.DIVIDE.apply(10, 20);
        System.out.println("DIVIDE: " + result);
    }
}
