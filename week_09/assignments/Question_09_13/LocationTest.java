package week_09.assignments.Question_09_13;

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");

        int numberOfRow = in.nextInt();
        int numberOfColumn = in.nextInt();
        double[][] numbers = new double[numberOfRow][numberOfColumn];

        System.out.println("Enter the array: ");

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = in.nextDouble();
            }
        }
        Location location = Location.locateLargest(numbers);

        System.out.printf("The location of the largest element is: %.2f at (%d, %d)", location.maxValue, location.row,
                location.column
        );
    }
}
