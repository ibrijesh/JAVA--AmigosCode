package com.amigoscode;


public class Main {

    public static void main(String[] args) {
        // Exceptions

        try {
            int number = Integer.parseInt("1x");   // char '1-9' are only allowed
            System.out.println(number);

            for (int i = 10; i >= 0; --i)
                System.out.println(10 / i);  // divide by zero

            System.out.println("END");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}