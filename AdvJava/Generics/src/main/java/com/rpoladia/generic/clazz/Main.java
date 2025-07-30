package com.rpoladia.generic.clazz;

public class Main {
    public static void main(String[] args) {
        /*
         * Box class is not generic class, it basically uses Object type value.
        Box box = new Box();
        box.setValue(100);
        int i = (int) box.getValue();
        //This will throw ClassCastException at runtime.
        String str = (String) box.getValue();
        System.out.println(i);
         */

        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.setValue(100);
        int i = genericBox.getValue();
        System.out.println(i);

        GenericPair<String, Integer> pair = new GenericPair<>("Age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        BoundedBox<Integer> boundedBox = new BoundedBox<>(100);
        System.out.println(boundedBox.getValue());

        //This will not work as String does not extend Number class.
        //BoundedBox<String> boundedBox2 = new BoundedBox<>(100);

        MultiBoundBox<MyNumber>  multiBoundBox = new MultiBoundBox<>(new MyNumber(1996));

        System.out.println(multiBoundBox.getValue());
        multiBoundBox.getValue().print();
    }
}
