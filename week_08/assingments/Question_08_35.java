package week_08.assingments;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix:");
        int numberOfRows = input.nextInt();

        int[][] matrix = new int[numberOfRows][numberOfRows];

        fillArray(matrix);
        int[] largestBlock = findLargestBlock(matrix);
    }

    private static int[] findLargestBlock(int[][] matrix) {
        int[] largestBlock = new int[2];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {

            }

        }
        return  largestBlock;
    }

    private static void fillArray(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
