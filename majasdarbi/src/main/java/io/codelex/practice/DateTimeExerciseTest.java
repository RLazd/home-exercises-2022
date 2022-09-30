package io.codelex.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static io.codelex.practice.DateTimeExercise.getTwoLocalDates;

public class DateTimeExerciseTest {
    public static void main(String[] args) {


        for (LocalDate date : DateTimeExercise.getTwoLocalDates()) {
            System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        }

        System.out.println(DateTimeExercise.findNextFriday13th(LocalDate.now()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}
