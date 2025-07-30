package com.rpoladia.generic.clazz;

/*
    NOTE:
        1. In multiple boundation, 1st will always be class then there can be multiple interface.
        2. All types must be separated by '&' symbol.
 */
public class MultiBoundBox<T extends Number & Printable> {
    T value;
    public MultiBoundBox(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}

