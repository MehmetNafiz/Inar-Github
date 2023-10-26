package week_08.assingments;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        double[][] sortedMatrix;

        fillMatrix(matrix);

        sortedMatrix = sortRows(matrix);
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

    private static double[][] sortRows(double[][] matrix) {
        double[][] sortedMatrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            int indexOfMin = 0;
            int indexOfMid = 0;
            int indexOfMax = 0;

            if (matrix[i][0] > matrix[i][1] && matrix[i][0] > matrix[i][2]) {
                if (matrix[i][1] > matrix[i][2]) {
                    indexOfMin = 2;
                    indexOfMid = 1;
                    indexOfMax = 0;
                } else {
                    indexOfMin = 1;
                    indexOfMid = 2;
                    indexOfMax = 0;
                }
            } else if (matrix[i][1] > matrix[i][0] && matrix[i][1] > matrix[i][2]) {
                if (matrix[i][0] > matrix[i][2]) {
                    indexOfMin = 2;
                    indexOfMid = 0;
                    indexOfMax = 1;
                } else {
                    indexOfMin = 0;
                    indexOfMid = 2;
                    indexOfMax = 1;
                }
            } else {
                if (matrix[i][0] > matrix[i][1]) {
                    indexOfMin = 1;
                    indexOfMid = 0;
                    indexOfMax = 2;
                } else {
                    indexOfMin = 0;
                    indexOfMid = 1;
                    indexOfMax = 2;
                }
            }

            sortedMatrix[i][0] = matrix[i][indexOfMin];
            sortedMatrix[i][1] = matrix[i][indexOfMid];
            sortedMatrix[i][2] = matrix[i][indexOfMax];

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
