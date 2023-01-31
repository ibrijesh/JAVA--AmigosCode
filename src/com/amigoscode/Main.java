package com.amigoscode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Enums

        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;

        Color red = Color.RED;
        Color black = Color.BLACK;

        TShirtSize small = TShirtSize.S;
        TShirtSize large = TShirtSize.L;

        // Enum Methods
        System.out.println(
                Gender.valueOf("FEMALE")
        );

        System.out.println(
                Arrays.toString(Gender.values())
        );


        System.out.println(male);
        System.out.println(female);

        System.out.println(red);
        System.out.println(black);

        System.out.println(small);
        System.out.println(large);

    }

}