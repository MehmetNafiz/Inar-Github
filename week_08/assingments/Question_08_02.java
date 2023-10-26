package week_08.assingments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][] array = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row:");

        fillArray(array);
        double sumOfDiagonal = sumMajorDiagonal(array);
        System.out.println("Sum of major elements in the major diagonal is " + sumOfDiagonal);
    }

    private static double sumMajorDiagonal(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }



    private static void fillArray(double[][] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
    }
}
