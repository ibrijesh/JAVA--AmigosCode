package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Exceptions

        int number = Integer.parseInt("1");   // char '1-9' are only allowed
        System.out.println(number);

        for (int i = 10; i >= 0; --i)
            System.out.println(10 / i);  // divide by zero

    }

}