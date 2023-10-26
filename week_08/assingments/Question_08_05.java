package week_08.assingments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        double[][] additionOfMatrixes = new double[3][3];

        fillArray(matrix1);
        fillArray(matrix2);

        addMatrixes(matrix1, matrix2, additionOfMatrixes);

        displayAddition(matrix1, matrix2, additionOfMatrixes);
    }

    private static void displayAddition(double[][] matrix1, double[][] matrix2, double[][] additionOfMatrixes) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%5.1f", matrix1[i][j]);
            }

            if(i == 1)
                System.out.printf("  +  ");
            else
                System.out.printf("     ");


            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%5.1f", matrix2[i][j]);
            }

            if(i == 1)
                System.out.printf("  =  ");
            else
                System.out.printf("     ");


            for (int j = 0; j < additionOfMatrixes[i].length; j++) {
                System.out.printf("%5.1f", additionOfMatrixes[i][j]);
            }

            System.out.println();

        }
    }

    private static void addMatrixes(double[][] matrix1, double[][] matrix2, double[][] additionOfMatrixes) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                additionOfMatrixes[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    private static void fillArray(double[][] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
    }
}
