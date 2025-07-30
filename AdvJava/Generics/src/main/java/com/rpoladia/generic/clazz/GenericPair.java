package com.rpoladia.generic.clazz;

/*
    NOTE:
        1. K stands for Key.
        2. V stand for Value.
 */
public class GenericPair <K, V>{
    private K key;
    private V value;

    public GenericPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
