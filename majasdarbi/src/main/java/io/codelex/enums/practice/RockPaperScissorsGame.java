package io.codelex.enums.practice;

import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int trials = 0;
        int playerWon = 0;
        int computerWon = 0;

        while (true) {
            System.out.println("Your turn (Enter s for scissor, p for paper, r for rock, q to quit)");
            String playersInitialChoice = scanner.nextLine();

            Rps playersChoice = null;
            if (playersInitialChoice.equals("q")) {
                break;
            } else if (!playersInitialChoice.equals("s") &&
                    !playersInitialChoice.equals("p") &&
                    !playersInitialChoice.equals("r")) {
                System.out.println("Invalid input, try again...");
                continue;
            } else {
                playersChoice = Rps.getRps(playersInitialChoice);
            }

            Rps computerChoice = Rps.randomRps();
            System.out.println("My turn: " + computerChoice);

            if (playersChoice == computerChoice) {
                System.out.println("Tie");
                trials++;
            } else if (computerChoice == Rps.ROCK && playersChoice == Rps.SCISSORS) {
                System.out.println("Stone breaks scissor, I won!");
                trials++;
                computerWon++;
            } else if (computerChoice == Rps.SCISSORS && playersChoice == Rps.PAPER) {
                System.out.println("Scissor cuts paper, I won!");
                trials++;
                computerWon++;
            } else if (computerChoice == Rps.PAPER && playersChoice == Rps.ROCK) {
                System.out.println("Paper wraps rock , I won!");
                trials++;
                computerWon++;

            } else {
                System.out.println("You won!");
                trials++;
                playerWon++;
            }

        }

        double percentagePlayerWon = playerWon * 100 / trials;
        double percentageComputerWon = computerWon * 100 / trials;

        System.out.println("Number of trials : " + trials);
        System.out.println(String.format("I won %d (%.2f%%). You won %d (%.2f%%).", playerWon, percentagePlayerWon, computerWon, percentageComputerWon));


    }
}
