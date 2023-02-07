package com.amigoscode;

// outer class
public class Main {

    public static void main(String[] args) {
        // Classes and Objects

        Cat cat = new Cat();
        cat.setName("Joe");
        System.out.println(cat.getName());
        cat.meow();

        Cat cat1 = new Cat();
        cat1.setName("Jimmy");
        System.out.println(cat1.getName());
        cat1.meow();

    }

    // inner class
    static class Cat {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void meow() {
            System.out.println(name + ": meow...");
        }

    }

}