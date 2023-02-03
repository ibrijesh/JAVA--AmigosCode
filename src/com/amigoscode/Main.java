package com.amigoscode;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // Working with BigDecimal

        BigDecimal number = BigDecimal.TEN;

        System.out.println(number);
        System.out.println(
                number.add(BigDecimal.ONE)
        );
        System.out.println(
                number.max(BigDecimal.ZERO)
        );
        System.out.println(
                number.compareTo(BigDecimal.ZERO)
        );
        System.out.println(
                number.compareTo(new BigDecimal("11"))
        );
        System.out.println(
                number.compareTo(BigDecimal.TEN)
        );


    }

}