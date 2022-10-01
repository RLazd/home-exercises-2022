package io.codelex.flowcontrol.practice;

public class PrintDayInWordExercise4 {

    public static void main(String[] args) {
        int dayNumber = 7;
        String day = null;

        switch (dayNumber) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Not a valid day";
                break;
        }

        System.out.println(day);

        dayNumber = 2;

        if (dayNumber >=0 && dayNumber <=6){
            if (dayNumber == 0) {
                System.out.println("Sunday");
            }
            if (dayNumber == 1) {
                System.out.println("Monday");
            }
            if (dayNumber == 2) {
                System.out.println("Tuesday");
            }
            if (dayNumber == 3) {
                System.out.println("Wednesday");
            }
            if (dayNumber == 4) {
                System.out.println("Thursday");
            }
            if (dayNumber == 5) {
                System.out.println("Friday");
            }
            if (dayNumber == 6) {
                System.out.println("Saturday");
            }
        } else {
            System.out.println("Not a valid day");
        }

    }
}





//    Write a program called PrintDayInWord which prints
//    “Sunday”, “Monday”, ... “Saturday”
//    if the int variable "dayNumber" is 0, 1, ..., 6, respectively.
//    Otherwise, it shall print "Not a valid day".
//
//        Use:
//
//        - a "nested-if" statement
//        - a "switch-case-default" statement.
