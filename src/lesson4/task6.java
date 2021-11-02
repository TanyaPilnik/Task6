package lesson4;

import java.util.Scanner;

public class task6 {
    public static final String EMPTY = "   ", CROSS = " X ", NULL = " O ";
    public static String player;
    public static final int ROW = 3, COLUMN = 3;
    public static String[][] fieldOfTheGame = new String[ROW][COLUMN];
    public static int statusOfTheGame;
    public static final int STATUS_GAME_CONTINUE = 0, STATUS_DRAWN = 1, STATUS_WIN_X = 3, STATUS_WIN_O = 4;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        StartGame();
        do {
            PlayerInput();
            StatusOfTheField();
            PrintField();
            if (statusOfTheGame == STATUS_WIN_X) {
                System.out.println(" Player 'X' won!");
            } else if (statusOfTheGame == STATUS_WIN_O) {
                System.out.println(" Player 'O' won!");
            } else if (statusOfTheGame == STATUS_DRAWN) {
                System.out.println(" the game ended in a draw!");
            }
            player = (player == CROSS ? NULL : CROSS);
        }
        while (statusOfTheGame == STATUS_GAME_CONTINUE);

    }

    public static void StartGame() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                fieldOfTheGame[i][j] = EMPTY;
            }
        }
        player = CROSS;
        PrintField();
    }

    public static void PlayerInput() {
        boolean inputIsRight = false;
        do {
            System.out
                    .println("Please player'" + player + "', choose a row (1-3) and a column (1-3). Example: 2 3  : ");
            int i = in.nextInt() - 1;
            int j = in.nextInt() - 1;
            if (i >= 0 && i < ROW && j >= 0 && j < COLUMN && fieldOfTheGame[i][j] == EMPTY) {
                fieldOfTheGame[i][j] = player;
                inputIsRight = true;
            } else {
                System.out.println("Chosen row and column can't be used (" + (i + 1) + "," + (j + 1)
                        + ") Please, try one more time");
            }
        } while (!inputIsRight);
    }

    public static void StatusOfTheField() {
        String winner = findWinner();
        if (winner.equals(CROSS)) {
            statusOfTheGame = STATUS_WIN_X;
        } else if (winner.equals(NULL)) {
            statusOfTheGame = STATUS_WIN_O;
        } else if (draw()) {
            statusOfTheGame = STATUS_DRAWN;
        } else {
            statusOfTheGame = STATUS_GAME_CONTINUE;
        }
    }

    public static boolean draw() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                if (fieldOfTheGame[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String findWinner() {
        int checkTheSame;
        for (int i = 0; i < ROW; i++) {
            checkTheSame = 0;
            for (int j = 0; j < COLUMN; j++) {
                if (fieldOfTheGame[i][0] != EMPTY && fieldOfTheGame[i][0] == fieldOfTheGame[i][j]) {
                    checkTheSame++;
                }
            }
            if (checkTheSame == 3) {
                return fieldOfTheGame[i][0];
            }
        }
        for (int j = 0; j < COLUMN; j++) {
            checkTheSame = 0;
            for (int i = 0; i < ROW; i++) {
                if (fieldOfTheGame[0][j] != EMPTY && fieldOfTheGame[0][j] == fieldOfTheGame[i][j]) {
                    checkTheSame++;
                }
            }
            if (checkTheSame == 3) {
                return fieldOfTheGame[0][j];
            }
        }
        if (fieldOfTheGame[0][0] != EMPTY && fieldOfTheGame[0][0] == fieldOfTheGame[1][1] && fieldOfTheGame[0][0] == fieldOfTheGame[2][2]) {
            return fieldOfTheGame[0][0];
        }
        if (fieldOfTheGame[0][2] != EMPTY && fieldOfTheGame[1][1] == fieldOfTheGame[0][2] && fieldOfTheGame[2][0] == fieldOfTheGame[0][2]) {
            return fieldOfTheGame[0][2];
        }
        return EMPTY;
    }

    public static void PrintField() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print(fieldOfTheGame[i][j]);
                if (j != COLUMN - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != ROW - 1) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

}
