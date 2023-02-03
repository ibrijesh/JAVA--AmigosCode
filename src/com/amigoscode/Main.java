package com.amigoscode;

public class Main {

    public static void main(String[] args) {
        // Problem with double

        double a = 0.02;
        double b = 0.03;
        double c = b - a;

        System.out.println(c);  // precision issue, we got 0.009999999999999998 instead of 0.1


    }

}