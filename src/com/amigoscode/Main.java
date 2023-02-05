package com.amigoscode;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner

        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

        System.out.println("Enter your age :");

        int age = scanner.nextInt();

        if (age < 18)
            System.out.println("You are a child");
        else
            System.out.println("You are adult");

        System.out.println("Enter your average marks :");

        double average = scanner.nextDouble();

        System.out.println("Your average marks is " + average);


    }

}