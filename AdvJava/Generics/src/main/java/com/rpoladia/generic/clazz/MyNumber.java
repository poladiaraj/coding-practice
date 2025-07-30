package com.rpoladia.generic.clazz;

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
