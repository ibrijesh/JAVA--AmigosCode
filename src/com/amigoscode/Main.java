package com.amigoscode;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        // Working with ZoneIds .

        for (String zone : ZoneId.getAvailableZoneIds())
            System.out.println(zone);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime nowInLondon = LocalDateTime.now(ZoneId.of("Europe/London"));

        System.out.println(localDateTime);
        System.out.println(nowInLondon);


    }

}