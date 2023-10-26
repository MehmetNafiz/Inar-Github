package week_08.assingments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        fillMatrix(matrix);
        displayMatrix(matrix);
        findFlippedCell(matrix);

    }

    private static void findFlippedCell(int[][] matrix) {
        int indexOfFlippedRow = findFlippedRow(matrix);
        int indexOfFlippedColumn = findFlippedColumn(matrix);

        System.out.println("The flipped cell is at (" + indexOfFlippedRow + "," + indexOfFlippedColumn + ")");
    }

    private static int findFlippedRow(int[][] matrix) {
        int flippedRow = -1;

        for (int i = 0; i < matrix.length; i++) {
            int numberOfOnes = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1)
                    numberOfOnes++;
            }
            if(numberOfOnes % 2 != 0)
                flippedRow = i;

        }

        return flippedRow;
    }

    private static int findFlippedColumn(int[][] matrix) {
        int flippedColumn = -1;

        for (int i = 0; i < matrix.length; i++) {
            int numberOfOnes = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[j][i] == 1)
                    numberOfOnes++;
            }
            if(numberOfOnes % 2 != 0)
                flippedColumn = i;

        }

        return flippedColumn;
    }

    private static void fillMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 6-by-6 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


