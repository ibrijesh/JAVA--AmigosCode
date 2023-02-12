package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Abstract Keyword

        // new Animal("Booby");   abstract class can not instantiated //
        Animal dog = new Dog("foo");
        Animal cat = new Cat("Bar");

        dog.makeSound();
        cat.makeSound();

    }

}