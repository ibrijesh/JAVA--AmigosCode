package com.amigoscode;

// outer class
public class Main {

    public static void main(String[] args) {
        // Classes and Objects

        Cat cat = new Cat();
        cat.setName("Joe");
        cat.setAge(5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.meow();

    }

    // inner class
    static class Cat {
        private String name;
        private int age;

        // Default constructor, with no argument
        public Cat() {
        }

        public void meow() {
            System.out.println(name + ": meow...");
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

}