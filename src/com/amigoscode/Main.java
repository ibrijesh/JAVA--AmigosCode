package com.amigoscode;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner

        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

    }

}