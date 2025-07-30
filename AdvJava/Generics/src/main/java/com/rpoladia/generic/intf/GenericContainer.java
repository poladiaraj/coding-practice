package com.rpoladia.generic.intf;

public class GenericContainer<T> implements Container<T>{
    T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
