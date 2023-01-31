package com.amigoscode;

import java.awt.*;

public class Main {

    final static String foo = "bar";

    public static void main(String[] args) {
        // final keyword , its like const in c++ but it with limited usage compared to c++

        // foo = "Hello"; not allowed

        final var name = "Brijesh";
        //  name="Rahul" not allowed

        final Point point = new Point(2, 4);
        //point = new Point(4, 5) not allowed because class object is declared as final.
        point.x = 4;
        point.y = 6;
        // allowed because variable are declared final in class Point

        System.out.println(foo);
        System.out.println(name);
        System.out.println(point);


    }

}