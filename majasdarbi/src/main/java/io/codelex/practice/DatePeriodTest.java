package io.codelex.practice;

import java.time.LocalDate;

public class DatePeriodTest {


    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        System.out.println(overlap);

        //do not overlap:
        LocalDate firstStart2 = LocalDate.of(2021, 1, 1);
        LocalDate firstEnd2 = LocalDate.of(2021, 1, 15);
        DatePeriod firstPeriod2 = new DatePeriod(firstStart2, firstEnd2);

        LocalDate secondStart2 = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd2 = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod2 = new DatePeriod(secondStart2, secondEnd2);

        DatePeriod overlap2 = secondPeriod2.intersection(firstPeriod2);

        System.out.println(overlap2);


        //is included:
        LocalDate firstStart3 = LocalDate.of(2022, 1, 05);
        LocalDate firstEnd3 = LocalDate.of(2022, 1, 25);
        DatePeriod firstPeriod3 = new DatePeriod(firstStart3, firstEnd3);

        LocalDate secondStart3 = LocalDate.of(2022, 1, 11);
        LocalDate secondEnd3 = LocalDate.of(2022, 1, 20);
        DatePeriod secondPeriod3 = new DatePeriod(secondStart3, secondEnd3);

        DatePeriod overlap3 = firstPeriod3.intersection(secondPeriod3);

        System.out.println(overlap3);
    }


}

//    Create a class DatePeriod. It should contain two LocalDate fields - start and end.
//        In the class create a method named - intersection.
//        The intersection method should receive DatePeriod as a parameter and
//        return DatePeriod - the intersection of both periods.
//        If periods do not intersect with each other, intersection method should return null.
//
//        See example how it should work:
//
//        LocalDate firstStart = LocalDate.of(2022, 1, 1);
//        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
//        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);
//
//        LocalDate secondStart = LocalDate.of(2022, 1, 10);
//        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
//        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);
//
//        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
//
//       //overlap variable should have start date 10.01.2022 and end date 15.01.2022

//        Hint: think of all the possible scenarios how two periods can overlap each other before writing code.
//        Write smaller private methods inside DatePeriod class that would help to calculate intersection,
//        like for example method that would check if periods even overlap, if one period completely includes the other etc.