package com.rpoladia.generic.clazz;

/*
    NOTE:
        1. T (stands for Type) is basically a convention (single capital alphabet).
        2. We can use any alphabet, or string.
 */
public class GenericBox<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
