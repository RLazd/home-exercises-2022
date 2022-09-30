package io.codelex.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePeriod {

    LocalDate startDate;
    LocalDate endDate;

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public DatePeriod intersection(DatePeriod datePeriod) {

        if (isOverlapping(datePeriod)) {

            if (isPeriodIncludedInTheOther(datePeriod) != null) {
                return isPeriodIncludedInTheOther(datePeriod);
            }

            return calculateIntersection(datePeriod);

        } else {

            System.out.println("Periods do not overlap");
            return null;

        }


    }


    private Boolean isOverlapping(DatePeriod datePeriod) {
        return (startDate.isBefore(datePeriod.startDate) && endDate.isAfter(datePeriod.startDate)) ||
                (startDate.isBefore(datePeriod.endDate) && endDate.isAfter(datePeriod.endDate));
    }

    private DatePeriod isPeriodIncludedInTheOther(DatePeriod datePeriod) {

        DatePeriod includedPeriod = null;

        if ((startDate.isAfter(datePeriod.startDate) || startDate.isEqual(datePeriod.startDate))
                && (endDate.isBefore(datePeriod.endDate) || endDate.isEqual(datePeriod.endDate))) {
            includedPeriod = new DatePeriod(startDate, endDate);
        } else if (startDate.isBefore(datePeriod.startDate) && endDate.isAfter(datePeriod.endDate)) {
            includedPeriod = new DatePeriod(datePeriod.startDate, datePeriod.endDate);
        }

        return includedPeriod;
    }

    private DatePeriod calculateIntersection(DatePeriod datePeriod) {

        LocalDate startForIntersectedPeriod;
        LocalDate endForIntersectedPeriod;

        if (startDate.isAfter(datePeriod.startDate)) {
            startForIntersectedPeriod = startDate;
        } else {
            startForIntersectedPeriod = datePeriod.startDate;
        }

        if (endDate.isAfter(datePeriod.endDate)) {
            endForIntersectedPeriod = datePeriod.endDate;
        } else {
            endForIntersectedPeriod = endDate;
        }

        return new DatePeriod(startForIntersectedPeriod, endForIntersectedPeriod);
    }


    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        return "DatePeriod { " +
                "startDate=" + formatter.format(startDate) +
                ", endDate=" + formatter.format(endDate) +
                " }";
    }
}
