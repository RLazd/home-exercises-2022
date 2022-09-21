package io.codelex.classesandobjects.practice.Date;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Date {

    private int day;
    private Month month;
    private int year;

    public Date(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayDate() {
        LocalDate date = LocalDate.of(year, month, day);

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        return formattedDate.format(date);
    }
}
