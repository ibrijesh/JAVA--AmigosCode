package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Static Keyword

        Cat rose1 = new Cat("Rose", 2, "Blue");
        Cat rose2 = new Cat("Rose", 2, "Blue");

        Cat[] cats = {rose1, rose2};

        Person joe = new Person("Joe", "Smith", Gender.MALE);
        Person alex = new Person("Alex", "Williams", Gender.MALE, cats);

        System.out.println(Person.count);  // static variable

    }

}