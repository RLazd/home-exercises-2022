package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static boolean isXTurn = true;

    private static char[][] board = new char[3][3];

    private static boolean playAgain = true;

    public static void main(String[] args) {

        while (playAgain) {
            Scanner keyboard = new Scanner(System.in);

            initBoard();
            displayBoard();

            do {
                play();
            } while (checkWinner(board) != 'x' && checkWinner(board) != 'o' && !isTie(board));


            determineResult();


            playAgain();
        }

    }


    private static void playAgain() {
        Scanner in = new Scanner(System.in);

        System.out.println("Do you want to play again? Y/N?");
        String play = in.nextLine();

        if (play.equals("Y")) {
            playAgain = true;
        } else if (play.equals("N")) {
            System.out.println("Nice game!");
            System.exit(0);
            playAgain = false;
        } else {
            System.out.println("Enter Y or N!");
            playAgain();
        }

    }

    private static void play() {

        if (isXTurn) {
            System.out.println("X turn");
        } else {
            System.out.println("O turn");
        }


        Scanner in = new Scanner(System.in);

        System.out.println(" Enter Y axis coordinate");
        int x = in.nextInt();

        System.out.println(" Enter X axis coordinate");
        int y = in.nextInt();


        if (board[x][y] == '-') {
            if (isXTurn) {
                board[x][y] = 'x';
            } else {
                board[x][y] = 'o';
            }

            displayBoard();

            isXTurn(board[x][y]);

        } else {
            System.out.println("Cell taken. Enter valid coordinates");
            play();
        }

    }


    private static void isXTurn(char player) {

        if (player == 'x') {
            isXTurn = false;
        } else if (player == 'o') {
            isXTurn = true;
        }

    }

    private static void determineResult() {
        if (checkWinner(board) == 'x') {
            System.out.println(" X won!");
        }
        if (checkWinner(board) == 'o') {
            System.out.println(" O won!");
        }
        if (isTie(board)) {
            System.out.println(" Tie!");
        }
    }

    private static char checkWinner(char[][] board) {

        //rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }

        //col
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        //diag
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }

        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

        return '-';
    }


    private static boolean isTie(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }


    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = '-';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}

