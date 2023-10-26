package week_08.live_class;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = getArray();

        System.out.println("\n Sum of all elements is " + sum(array));
    }

    private static int sum(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    private static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        int[][] result = new int[3][4];
        System.out.println("Enter " + result.length + " rows and " + result[0].length + " colums: ");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextInt();
            }

        }
        return result;
    }

}
