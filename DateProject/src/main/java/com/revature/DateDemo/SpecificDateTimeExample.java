package com.revature.DateDemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class SpecificDateTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 07, 29);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(4, 5,25);
        System.out.println(localTime);
    }
}
