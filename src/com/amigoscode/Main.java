package com.amigoscode;


public class Main {

    public static Person[] PEOPLE = null;

    static {
        System.out.println("static initialization in main");
        PEOPLE = new Person[10];

        // business logic
    }

    public static void main(String[] args) {
        // Static Keyword

        System.out.println(Person.count);

        System.out.println();

        new Person();            // static initialization block is not invoked.
        System.out.println(Person.count);

    }

}