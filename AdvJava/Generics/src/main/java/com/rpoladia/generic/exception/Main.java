package com.rpoladia.generic.exception;

public class Main {
    public static void main(String[] args) {

        try{
            throw new MyException(1);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        try{
            throw new MyException("String");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
