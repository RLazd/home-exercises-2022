package io.codelex.arithmetic.practice;

public class Exercise8 {

    public static void main(String[] args) {

        Employee[] employeeList = new Employee[3];
        employeeList[0] =  new Employee("Employee 1", 7.50, 35);
        employeeList[1] = new Employee("Employee 2", 8.20, 47);
        employeeList[2] = new Employee("Employee 3", 10.00, 67);




        System.out.println("| Employee   | Base Pay   | Hours Worked  | WeeklyPay  |");
        System.out.println("| ---------  | ---------- | ------------- | ---------  |");

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(String.format("|%12s|%12.2f|%15d|%12s|",
                    employeeList[i].employee,
                    employeeList[i].basePay,
                    employeeList[i].hoursWorked,
                    calculateWeeklyPay(employeeList[i].basePay,employeeList[i].hoursWorked ) ));
        }


    }

    public static String calculateWeeklyPay(double basePay, int hoursWorked) {

        if (checkBasePayAndHours(basePay, hoursWorked)) {
             if (hoursWorked <= 40) {
                 return String.valueOf(basePay * hoursWorked);
             } else {
                 return String.valueOf(basePay * 40 + basePay * (hoursWorked-40) * 1.5);
             }
        } else {
            return "Error";
        }
    }

    public static boolean checkBasePayAndHours (double basePay, int hoursWorked) {
        if (basePay > 8.00) {
            if (hoursWorked < 60) {
                return true;
            }
        }
        return false;
    }

}
