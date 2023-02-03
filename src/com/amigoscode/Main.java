package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        // Creating specific Date with LocalDateTime .

        LocalDateTime someDate = LocalDateTime.of(
                1998,
                Month.OCTOBER,
                2,
                10,
                10
        );

        System.out.println(someDate);

        // Creating specific Date with LocalDate .

        LocalDate someDate2 = LocalDate.of(
                1998,
                Month.OCTOBER,
                2
        );

        System.out.println(someDate2);

        // Creating specific Date with LocalTime .

        LocalTime someTime = LocalTime.of(
                10,
                10,
                55
        );

        System.out.println(someTime);

    }

}