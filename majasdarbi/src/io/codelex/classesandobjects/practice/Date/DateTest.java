package io.codelex.classesandobjects.practice.Date;

import java.time.LocalDate;
import java.time.Month;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(19, Month.APRIL, 2020);

        System.out.println(date1.displayDate());

        date1.setDay(20);
        date1.setYear(2021);
        System.out.println(date1.displayDate());

        date1.setMonth(Month.of(7));
        System.out.println(date1.getMonth());

        LocalDate now = LocalDate.now();
        System.out.println(now);

        Date dateNow = new Date(now.getDayOfMonth(), now.getMonth(), now.getYear());
        System.out.println(dateNow.displayDate());

    }
}
