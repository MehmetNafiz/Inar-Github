package week_08.assingments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        boolean isMarkovMatrix;

        fillMatrix(matrix);
        isMarkovMatrix = isMarkovMatrix(matrix);

        if(isMarkovMatrix)
            System.out.println("It is a Markov Matrix");
        else
            System.out.println("It is not a Markov Matrix");
    }

    private static boolean isMarkovMatrix(double[][] matrix) {
        boolean isMarkovMatrix = true;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0)
                    isMarkovMatrix = false;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            double sumOfColumn = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumOfColumn += matrix[j][i];
            }
            if(sumOfColumn != 1)
                isMarkovMatrix = false;
        }

        return isMarkovMatrix;
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
