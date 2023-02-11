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


        java.writeSomeCode();

        /* Even thoe these functions are not declared in Programmer, but these public functions are inherited from Employee class */

        System.out.println(java.getName());
        System.out.println(java.getAge());
        System.out.println(java.getAddress());
        System.out.println(java.getExperience());

    }

}