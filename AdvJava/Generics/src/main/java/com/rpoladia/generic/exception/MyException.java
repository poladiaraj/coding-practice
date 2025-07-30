package com.rpoladia.generic.exception;

/*
 * NOTE: Cannot do this, compile time error.
class GenericException<T> extends Exception {
}
*/

public class MyException extends Exception {
    public <T> MyException(T value) {
        super("Exception related to value: " + value.toString() + " of type: " + value.getClass().getName());
    }
}

