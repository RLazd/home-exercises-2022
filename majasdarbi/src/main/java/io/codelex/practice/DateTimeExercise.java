package io.codelex.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        try {
            LocalDate fromToFridays = from;
            while (fromToFridays.getDayOfWeek() != DayOfWeek.FRIDAY) {
                fromToFridays = fromToFridays.plusDays(1);
            }

            LocalDate nextFriday13th = fromToFridays;
            while (nextFriday13th.getDayOfMonth() != 13) {
                nextFriday13th = nextFriday13th.plusWeeks(1);
            }

            return nextFriday13th;

        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }
    }
}
