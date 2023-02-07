package com.amigoscode;

// outer class
public class Main {

    public static void main(String[] args) {
        // Classes and Objects

        /* Working with Default constructor */
        Cat cat = new Cat();
        cat.setName("Joe");
        cat.setAge(5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.meow();

        /* Working with Parameterized constructor */
        Cat cat1 = new Cat("Rose", 2);
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        cat1.meow();


        Cat cat2 = new Cat("Jupiter");
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());
        cat2.meow();

    }

    // inner class
    static class Cat {
        private String name;
        private int age;

        // Multiple Constructor
        public Cat() {
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat(String name) {
            this.name = name;
            this.age = 0;
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