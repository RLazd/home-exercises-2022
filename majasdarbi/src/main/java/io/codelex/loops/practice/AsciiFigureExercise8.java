package io.codelex.loops.practice;

public class AsciiFigureExercise8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String line = "";
            for (int j = 0; j < 16 - 4 * i; j++) {
                line += "/";
            }
            if (i >= 1) {
                for (int k = 0; k <= i * 8; k++) {
                    line += "*";
                }
            }
            for (int l = 0; l < 16 - 4 * i; l++) {
                line += "\\";
            }
            System.out.println(line);
        }


        int n = 7;
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < 4 * (n - 1) - i * 4; j++) {
                line += "/";
            }
            if (i >= 1) {
                for (int k = 0; k < i * 8; k++) {
                    line += "*";
                }
            }
            for (int l = 0; l < 4 * (n - 1) - i * 4; l++) {
                line += "\\";
            }
            System.out.println(line);
        }
    }
}

