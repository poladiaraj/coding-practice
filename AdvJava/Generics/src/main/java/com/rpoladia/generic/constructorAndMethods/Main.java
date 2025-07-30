package com.rpoladia.generic.constructorAndMethods;

public class Main {

    public static void main(String[] args) {
        GenericConstructor genericConstructor = new GenericConstructor(5);

        Integer[] array = {1,2,3,4,5};
        GenericMethods.printArray(array);

        String[] stringArray = {"Hello", "World"};
        GenericMethods.printArray(stringArray);

        GenericMethods.printArray(stringArray, array);
    }
}
