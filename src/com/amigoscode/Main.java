package com.amigoscode;

// outer class
public class Main {

    public static void main(String[] args) {
        // Classes and Objects

        Cat cat = new Cat();
        cat.name = "Joe";
        cat.meow();

    }

    // inner class
    static class Cat {
        private String name;

        public void meow() {
            System.out.println(name + ": meow...");
        }


    }

}