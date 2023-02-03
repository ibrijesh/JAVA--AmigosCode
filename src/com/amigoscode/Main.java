package com.amigoscode;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // Problem with double

        BigDecimal a = new BigDecimal("0.2");
        BigDecimal b = new BigDecimal("0.3");
        BigDecimal c = b.subtract(a);

        System.out.println(c);  // no precision issue, we got  0.1


    }

}