package com.rpoladia.generic.clazz;

public class BoundedBox<T extends Number> {
    T value;
    public BoundedBox(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
