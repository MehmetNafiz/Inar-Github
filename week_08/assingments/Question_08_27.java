package week_08.assingments;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        double[][] sortedMatrix;

        fillMatrix(matrix);

        sortedMatrix = sortColumns(matrix);
        displayMatrix(sortedMatrix);

    }

    private static void displayMatrix(double matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] sortColumns(double[][] matrix) {
        double[][] sortedMatrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            int indexOfMin = 0;
            int indexOfMid = 0;
            int indexOfMax = 0;

            if (matrix[0][i] > matrix[1][i] && matrix[0][i] > matrix[2][i]) {
                if (matrix[1][i] > matrix[2][i]) {
                    indexOfMin = 2;
                    indexOfMid = 1;
                    indexOfMax = 0;
                } else {
                    indexOfMin = 1;
                    indexOfMid = 2;
                    indexOfMax = 0;
                }
            } else if (matrix[1][i] > matrix[0][i] && matrix[1][i] > matrix[2][i]) {
                if (matrix[0][i] > matrix[2][i]) {
                    indexOfMin = 2;
                    indexOfMid = 0;
                    indexOfMax = 1;
                } else {
                    indexOfMin = 0;
                    indexOfMid = 2;
                    indexOfMax = 1;
                }
            } else {
                if (matrix[0][i] > matrix[1][i]) {
                    indexOfMin = 1;
                    indexOfMid = 0;
                    indexOfMax = 2;
                } else {
                    indexOfMin = 0;
                    indexOfMid = 1;
                    indexOfMax = 2;
                }
            }

            sortedMatrix[0][i] = matrix[indexOfMin][i];
            sortedMatrix[1][i] = matrix[indexOfMid][i];
            sortedMatrix[2][i] = matrix[indexOfMax][i];

        }
        return sortedMatrix;
    }

    private static void fillMatrix(double[][] matrix) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
    }
}
