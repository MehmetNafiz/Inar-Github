package week_08.assingments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {

        double[][] array = fillArray();
        findAndDisplayGreatestElements(array);
    }

    private static void findAndDisplayGreatestElements(double[][] array) {
        double greatestNumber = array[0][0];
        int rowOfGreatestNumber = 0;
        int columnOfGreatestNumber = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > greatestNumber){
                    greatestNumber = array[i][j];
                    rowOfGreatestNumber = i;
                    columnOfGreatestNumber = j;
                }

            }

        }
        System.out.println("The location of the largest element is at (" +
                rowOfGreatestNumber + "," + columnOfGreatestNumber + ")");
    }

    private static double[][] fillArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the array:");
        int numberOfRow = input.nextInt();
        int numberOfColumns = input.nextInt();

        double[][] array = new double[numberOfRow][numberOfColumns];

        System.out.println("Enter the array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
}
