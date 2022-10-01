package io.codelex.arithmetic.practice;


public class CozaLozaWozaExercise6 {
    public static void main(String[] args) {


        StringBuilder text = new StringBuilder(" ");

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                text.append("Coza");
            }
            if (i % 5 == 0) {
                text.append("Loza");
            }
            if (i % 7 == 0) {
                text.append("Woza");
            }
            if (i % 7 != 0 && i % 3 !=0 && i % 5 != 0) {
                text.append(i);
            }
            if (i % 11 == 0) {
                text.append("\n");
            }

            text.append(" ");
        }

        System.out.println(text);

//        for (int i = 1; i <= 110; i++) {
//            if (i % 3 == 0) {
//                if (i % 5 == 0) {
//                    if (i % 7 == 0) {
//                        System.out.print("CozaLozaWoza ");
//                    } else {
//                        System.out.print("CozaLoza ");
//                    }
//                } else if (i % 7 == 0) {
//                    System.out.print("CozaWoza ");
//                } else {
//                    System.out.print("Coza ");
//                }
//                if (i % 11 == 0) {
//                    System.out.println();
//                }
//            } else if (i % 5 == 0) {
//                if (i % 7 == 0) {
//                    System.out.print("LozaWoza ");
//                } else {
//                    System.out.print("Loza ");
//                }
//                if (i % 11 == 0) {
//                    System.out.println();
//                }
//            } else if (i % 7 == 0) {
//                System.out.print("Woza ");
//                if (i % 11 == 0) {
//                    System.out.println();
//                }
//            } else if (i % 11 == 0) {
//                System.out.println(i+ " ");
//            } else {
//                System.out.print(i + " ");
//            }
//        }
    }
}
