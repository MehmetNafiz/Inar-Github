package week_08.assingments;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] array = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");

        fillArray(array);
        sumColumnsOfArray(array);
    }

    private static void fillArray(double[][] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
    }

    private static void sumColumnsOfArray(double[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            System.out.println("Sum of the elements at column " + i + " is " + sum);

        }
    }
}
