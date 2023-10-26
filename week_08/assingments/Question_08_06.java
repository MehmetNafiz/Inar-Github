package week_08.assingments;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        double[][] multiplationOfMatrixes;

        fillArray(matrix1);
        fillArray(matrix2);

        multiplationOfMatrixes = multiplyMatrix(matrix1, matrix2);

        displayAddition(matrix1, matrix2, multiplationOfMatrixes);
    }


    private static void displayAddition(double[][] matrix1, double[][] matrix2, double[][] additionOfMatrixes) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%5.1f", matrix1[i][j]);
            }

            if(i == 1)
                System.out.printf("  *  ");
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

    private static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multiplationOfMatrixes = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                multiplationOfMatrixes[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j] + matrix1[i][2] * matrix2[2][j];
            }
        }
        return multiplationOfMatrixes;
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
