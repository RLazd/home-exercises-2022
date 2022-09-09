package io.codelex.arithmetic.practice;

public class Exercise8 {

    String employee;
    double basePay; //teica,ka pie naudas double nelieto. ko lieto?
    int hoursWorked;
    //double weeklyPay; - jāliek pie metodes vai sākumā?

    public static void main(String[] args) {
        Exercise8 employee1 = new Exercise8("Employee 1", 7.50, 35);
        Exercise8 employee2 = new Exercise8("Employee 2", 8.20, 47);
        Exercise8 employee3 = new Exercise8("Employee 3", 10.00, 47);

        Exercise8[] employeeList = {employee1, employee2, employee3};


        //-check basepay
        //-check hours
        //calculateweeklypay
        //make table

        System.out.println("| Employee  | Base Pay | Hours Worked | WeeklyPay");
        System.out.println("| --------- | --------- | ----------- | ---------");

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(String.format("|%12s|%12.2d|%12.2d|%12.2d|",
                    employeeList[i].employee, employeeList[i].basePay,
                    employeeList[i].hoursWorked, employeeList[i].calculateWeeklyPay() )); /// ?
        }


    }

    public Exercise8(String name, double pay, int hours) {
        this.employee = name;
        this.basePay = pay;
        this.hoursWorked = hours;
    }

    public static void calculateWeeklyPay(double basePay, int hoursWorked) {

        double weeklyPay = 0; //kā assignot ??
        if (checkBasePayAndHours(basePay, hoursWorked)) {
             if (hoursWorked <= 40) {
                 weeklyPay = basePay * hoursWorked;
             } else {
                 weeklyPay = basePay * 40 + basePay * (hoursWorked-40) * 1.5;
             }
        } else {
            throw new exception_class("error message")//throw error!!
        }
    }

    public static boolean checkBasePayAndHours (double basePay, int hoursWorked) {
        if (basePay > 8.00) {
            if (hoursWorked < 60) {
                return true;
            }
        } else {
            return false;
        }
    }

}

//    Foo Corporation needs a program to calculate how much to pay their hourly employees. The US Department of Labor
//        requires that employees get paid time and a half for any hours over 40 that they work in a single week. For example, if an
//        employee works 45 hours, they get 5 hours of overtime, at 1.5 times their base pay. The State of Massachusetts requires
//        that hourly employees be paid at least $8.00 an hour. Foo Corp requires that an employee not work more than 60 hours in
//        a week.
//
//        ## Summary
//
//        - An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
//        - For every hour over 40, they get overtime = (base pay) × 1.5.
//        - The base pay must not be less than the minimum wage ($8.00 an hour). If it is, print an error.
//        - If the number of hours is greater than 60, print an error message.
//
//        Write a method that takes the base pay and hours worked as parameters, and prints the total pay or an error. Write a main
//        method that calls this method for each of these employees:
//
//        | Employee | Base Pay | Hours Worked |
//        | --- | --- | --- |
//        | Employee 1 | $7.50 | 35 |
//        | Employee 2 | $8.20 | 47 |
//        | Employee 3 | $10.00 | 73 |