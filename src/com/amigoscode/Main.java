package com.amigoscode;

// outer class
public class Main {

    public static void main(String[] args) {
        // Classes and Objects

        Cat cat = new Cat();
        cat.setName("Joe");
        cat.meow();

        Cat cat1 = new Cat();
        cat1.setName("Jimmy");
        cat1.meow();

    }

    // inner class
    static class Cat {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void meow() {
            System.out.println(name + ": meow...");
        }

    }

}