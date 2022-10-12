package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanExercise8 {

    private static String[] wordList = new String[]{"robot", "machine", "car", "leviathan", "plane", "hyacinth"};
    private static String word;
    private static String correctLettersFromWord;
    private static StringBuilder missedLettersFromWord;
    private static int timesGuessed;
    private static int maxAllowedGuessTimes;

    public static boolean playAgain = true;


    public static void main(String[] args) {

        while (playAgain) {
            word = randomlyChooseWordFromWordList();
            timesGuessed = 0;
            maxAllowedGuessTimes = word.length() + 3;
            missedLettersFromWord = new StringBuilder();

            System.out.println(word);

            correctLettersFromWord = "_".repeat(word.length());
            System.out.println(correctLettersFromWord);

            while (!isWordGuessed() &&
                    timesGuessed <= maxAllowedGuessTimes) {
                play();
            }

            determineResult();
            playAgain();

        }

    }

    private static void play() {

        System.out.println("Guess letter: ");
        Scanner in = new Scanner(System.in);
        char guessedLetter = in.next().charAt(0);

        if (word.contains(String.valueOf(guessedLetter))) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guessedLetter) {
                    correctLettersFromWord =
                            correctLettersFromWord.substring(0, i) +
                                    guessedLetter +
                                    correctLettersFromWord.substring(i + 1);
                }
            }

        } else {
            missedLettersFromWord.append(String.valueOf(guessedLetter));

        }

        timesGuessed += 1;

        System.out.println("Word " + correctLettersFromWord);
        System.out.println("Missed: " + missedLettersFromWord);

    }

    private static boolean isWordGuessed() {
        if (!correctLettersFromWord.contains("_")) {
            return true;
        }
        return false;
    }


    private static void determineResult() {
        if (isWordGuessed()) {
            System.out.println(" You got it! ");
            System.out.println("Word is " + correctLettersFromWord);
            System.out.println("You missed: " + missedLettersFromWord);
        }
        if (timesGuessed > maxAllowedGuessTimes) {
            System.out.println(" You lost! ");
            System.out.println("Word is " + word);
            System.out.println("You missed: " + missedLettersFromWord);
        }
    }


    private static String randomlyChooseWordFromWordList() {
        int randomNumber = (int) (Math.random() * (wordList.length));
        return wordList[randomNumber];
    }

    private static void playAgain() {
        Scanner in = new Scanner(System.in);
        System.out.println("Play again? Y/N");

        String answer = in.nextLine();

        if (answer.equals("Y")) {
            System.out.println("New game!");
            playAgain = true;
        } else if (answer.equals("N")) {
            System.out.println("Bye bye!");
            System.exit(0);
            playAgain = false;
        } else {
            System.out.println(" Enter Y or N");
            playAgain();
        }
    }

}

