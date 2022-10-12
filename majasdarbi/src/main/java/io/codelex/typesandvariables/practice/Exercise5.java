package io.codelex.typesandvariables.practice;

public class Exercise5 {
    private static String[] classes = {"English III", "Precalculus", "Music Theory","Biotechnology",
            " Principles of Technology I", "Latin II", "AP US History",
            "Business Computer Infomation Systems" };
    private static String[] teachers = {"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer",
            "Ms. Garcia", "Mrs. Barnett", "Ms. Johannesen", "Mr. James" };

    public static void main(String[] args) {
        timeTable();

    }

    public static void timeTable() {
        System.out.println("+------------------------------------------------------------+");

        for (int i =0; i < classes.length; i++) {
            System.out.println(String.format("|%2d|%38s|%18s|", i, classes[i], teachers[i]));
        }

        System.out.println("+------------------------------------------------------------+");
    }


}


//    Use several variables to store the names of your classes and their teachers.
//        Then, display a nice little table displaying your schedule.
//        Just FYI, my column of courses has a width of 26 characters,
//        and the teacher column has a width of 15.
//        The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs)
//        and another plus sign.
//
//        Your table doesn't need to look exactly like this, or even line up.
//        I used a total of sixteen variables
//        (course1, course2, ... course8, teacher1, teacher2, etc.). You should do the same.
//
//        ```
//        +------------------------------------------------------------+
//        | 1 |                          English III |       Ms. Lapan |
//        | 2 |                          Precalculus |     Mrs. Gideon |
//        | 3 |                         Music Theory |       Mr. Davis |
//        | 4 |                        Biotechnology |      Ms. Palmer |
//        | 5 |           Principles of Technology I |      Ms. Garcia |
//        | 6 |                             Latin II |    Mrs. Barnett |
//        | 7 |                        AP US History | Ms. Johannessen |
//        | 8 | Business Computer Infomation Systems |       Mr. James |
//        +------------------------------------------------------------+
//        ```