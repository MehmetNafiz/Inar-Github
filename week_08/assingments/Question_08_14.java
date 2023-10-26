package week_08.assingments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size for the matrix:");
        int sizeOfMatrix = input.nextInt();
        int[][] array;

        array = fillArray(sizeOfMatrix);

        displayArray(array);

        analyzeArray(array);
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillArray(int sizeOfMatrix) {
        int[][] array = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                array[i][j] = (int)(Math.random() * 2);
            }
        }
        return array;
    }

    private static void analyzeArray(int[][] array) {
        analyzeRows(array);
        analyzeColumns(array);
        analyzeDiagonals(array);


    }

    private static void analyzeRows(int[][] array) {
        boolean sameNumbers = false;


        for (int i = 0; i < array.length; i++) {
            boolean isAllRow = true;
            for (int j = 0; j <array[i].length - 1; j++) {
                if(array[i][j] != array[i][j + 1])
                    isAllRow = false;
            }
            if (isAllRow) {
                System.out.println("All " + array[i][0] + "s on row" + i);
                sameNumbers = true;
            }
        }

        if(!sameNumbers) {
            System.out.println("No same numbers on a row");
        }
    }

    private static void analyzeColumns(int[][] array) {
        boolean sameNumbers = false;

        for (int i = 0; i < array.length; i++) {
            boolean isAllColumn = true;
            for (int j = 0; j <array[i].length - 1; j++) {
                if(array[j][i] != array[j + 1][i])
                    isAllColumn = false;
            }
            if (isAllColumn) {
                System.out.println("All " + array[0][i] + "s on column" + i);
                sameNumbers = true;
            }
        }

         if(!sameNumbers) {
             System.out.println("No same numbers on a column");
         }
    }

    private static void analyzeDiagonals(int[][] array) {

    }
}
