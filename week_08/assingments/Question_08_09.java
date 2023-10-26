package week_08.assingments;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        char[][] matrix = new char[3][3];
        char winner;
        char currentPlayer = 'X';

        fillArray1(matrix);
        drawTable(matrix);

        while (counter < 9) {
            game(matrix, currentPlayer);
            drawTable(matrix);
            winner = isFinish(matrix, currentPlayer);

            if (winner == 'C');

            else {
                System.out.println("\n\n");
                System.out.println("****************************");
                System.out.println("The winner is player " + currentPlayer);
                break;
            }


            if (currentPlayer == 'X')
                currentPlayer = 'O';
            else
                currentPlayer = 'X';

        }
    }

    private static char isFinish(char[][] matrix, char currentPlayer) {
        boolean isFinish = false;
        char winner;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] != ' ') {
                if (matrix[i][0] == currentPlayer && matrix[i][1] == currentPlayer && matrix[i][2] == currentPlayer)
                    isFinish = true;
                if (matrix[0][i] == currentPlayer && matrix[1][i] == currentPlayer && matrix[2][i] == currentPlayer)
                    isFinish = true;
            }
        }
        if (matrix[0][0] == currentPlayer && matrix[1][1] == currentPlayer && matrix[2][2] == currentPlayer)
            isFinish = true;
        if (matrix[0][2] == currentPlayer && matrix[1][1] == currentPlayer && matrix[2][0] == currentPlayer)
            isFinish = true;

        if (isFinish)
            return currentPlayer;
        else
            return 'C'; //'C' for Continue
    }

    private static void game(char[][] matrix, char currentPlayer) {
        Scanner input = new Scanner(System.in);
        int row = 0;
        int column = 0;

        do {
            System.out.println("Enter a row(0, 1 or 2) for player " + currentPlayer);
            row = input.nextInt();

            System.out.println("Enter a column(0, 1 or 2) for player " + currentPlayer);
            column = input.nextInt();
        }
        while (!isBlank(matrix, row, column));

        matrix[row][column] = currentPlayer;
    }

    private static boolean isBlank(char[][] matrix, int row, int column) {
        if (matrix[row][column] == ' ')
            return true;
        else
            return false;
    }

    private static void drawTable(char[][] matrix) {
        System.out.println("--------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("--------------------------");
    }

    private static void fillArray1(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = ' ';
            }
        }
    }


}
