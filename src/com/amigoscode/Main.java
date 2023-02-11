package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Inheritance

        String[] languages = {"Java", "Go", "C++"};

        Programmer java = new Programmer(
                "Brijesh",
                24,
                "Lucknow",
                "Full Stack Development",
                languages);


        java.sayHi();

    }

}