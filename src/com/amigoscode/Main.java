package com.amigoscode;

import static java.lang.Math.*;

public class Main {

    public static Person[] PEOPLE = null;

    static {
        System.out.println("static initialization in main");
        PEOPLE = new Person[10];

        // business logic
    }

    public static void main(String[] args) {
        // Static Keyword

        System.out.println(max(10, 20));
        System.out.println(min(10, 20));
        System.out.println(sqrt(16));

    }

}