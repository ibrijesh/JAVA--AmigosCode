package com.amigoscode;


import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Maven");

        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().city());

    }

}