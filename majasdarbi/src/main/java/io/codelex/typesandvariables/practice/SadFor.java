package io.codelex.typesandvariables.practice;

import io.codelex.NoCodeWrittenException;

//Es nesapratu uzdevumu, tādēļ atstāju divas variācijas
public class SadFor {
    public static void main(String[] args) {

        System.out.println(printFirstNumberWhichPassesIf());
        printAllNumbersUntilIfPassed();
    }

    public static int printFirstNumberWhichPassesIf() {
        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                return i;
            }
        }
        throw new NoCodeWrittenException();
    }

    public static void printAllNumbersUntilIfPassed(){
        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                break;
            }
            System.out.print(i);
        }
    }
}
