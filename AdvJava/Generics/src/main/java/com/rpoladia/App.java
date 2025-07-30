package com.rpoladia;

import java.util.ArrayList;

/*
    Why generics?
     -> Compile time type checks.
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         * Without Generics
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);

        String str = (String) list.get(0);
        //Below will fail at RT with ClassCastException
        String integer = (String) list.get(1);
         */

        //No need to put any type on right hand side, empty brackets suffice.
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("String1");
        listOfStrings.add("String2");
        listOfStrings.add("String3");


    }
}
