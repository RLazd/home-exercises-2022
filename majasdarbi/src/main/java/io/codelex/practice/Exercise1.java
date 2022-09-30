package io.codelex.practice;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Exercise1 {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2022, 9, 22);
        LocalDate stopDate = LocalDate.now();

        List<LocalDate> datesExcludingWeekends = new ArrayList<>();

        Set<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

        LocalDate date = startDate;
        while (date.isBefore(stopDate.plusDays(1))) {   //stopDate - including
            if (!weekend.contains(date.getDayOfWeek())) {
                //System.out.println(date.getDayOfWeek());
                datesExcludingWeekends.add(date);
            }
            date = date.plusDays(1);
        }

        int hoursWorkedBetweenDates = datesExcludingWeekends.size() * 8;

        //System.out.println(datesExcludingWeekends);
        System.out.println(hoursWorkedBetweenDates);


    }
}
