package com.amigoscode;

// outer class
public class Main {

    public static void main(String[] args) {
        // Classes and Objects

        /* Working with Default constructor */
        Cat joe = new Cat();
        joe.setName("Joe");
        joe.setAge(5);
        joe.setColor("Black");
        System.out.println(joe);


        /* Working with Parameterized constructor */
        Cat rose = new Cat("Rose", 2, "Blue");
        System.out.println(rose);


        Cat jupiter = new Cat("Jupiter");
        System.out.println(jupiter);

    }

    // inner class
    static class Cat {
        private String name;
        private int age;
        private String color;

        // Multiple Constructor
        public Cat() {
        }

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
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