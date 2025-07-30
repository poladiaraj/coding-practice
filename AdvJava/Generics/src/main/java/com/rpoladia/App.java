package com.rpoladia;

import java.util.ArrayList;

/*
    Why generics 
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);

        String str = (String) list.get(0);
        String integer = (String) list.get(1);
    }
}
