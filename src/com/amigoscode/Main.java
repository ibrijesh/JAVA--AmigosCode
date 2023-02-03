package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // Working with Dates (LocalDate and LocalTime Classes.

        LocalDate localDate = LocalDate.now();   // LocalDate

        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.minusDays(5));

        LocalTime localTime = LocalTime.now();   // LocalTime


        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());


    }

}