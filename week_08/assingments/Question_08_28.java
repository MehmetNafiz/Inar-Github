package week_08.assingments;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        boolean isEquals;

        System.out.println("Enter list1:(3x3) ->");
        fillMatrix(matrix1);
        System.out.println("Enter list2:(3x3) ->");
        fillMatrix(matrix2);

        isEquals = equals(matrix1, matrix2);

        if (isEquals)
            System.out.println("The two arrays are strictly identical");
        else
            System.out.println("The two arrays are not strictly identical");

    }

    private static boolean equals(int[][] matrix1, int[][] matrix2) {
        boolean isEquals = true;

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if(matrix1[i][j] != matrix2[i][j])
                    isEquals = false;
            }
        }
        return isEquals;
    }

    private static void fillMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
