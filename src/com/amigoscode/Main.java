package com.amigoscode;

// outer class
public class Main {

    public static void main(String[] args) {
        // Comparing Objects

        Cat rose = new Cat("Rose", 2, "Blue");
        Cat rose1 = new Cat("Rose", 2, "Blue");

        System.out.println(rose.equals(rose1));   // No, bcz  internal implementation of .equals to uses the ==

        Cat rose2 = rose;

        System.out.println(rose.equals(rose2)); // Yes, but it still compares references not Objects values bcz  internal implementation of .equals to uses the ==


    }

    // inner class
    static class Cat {
        private String name;
        private int age;
        private String color;

        // Multiple Constructor
        public Cat() {
        }

        // this keyword eliminate confusion between method local variable vs class variables.
        public Cat(String name, int age, String color) {
            this(name, age);       // inside constructor
            // this();          only on first line inside constructor can be called.
            this.color = color;
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat(String name) {
            this.name = name;
            this.age = 0;
            this.color = null;
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

        public String getColor() {
            return color;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public void setColor(String color) {
            this.color = color;
        }

        /* toString */

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

}