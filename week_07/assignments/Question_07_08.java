package week_07.assignments;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] doubleList = new double[10];

        System.out.println("Enter ten double numbers:");

        for (int i = 0; i < 10 ; i++) {
            doubleList[i] = input.nextInt();
        }

        double average = average(doubleList);
        System.out.println("Average of 10 doubles is " + average);
    }

    private static double average(double[] list) {
        System.out.println("This is average method for doubles");

        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / 10.0;
    }

    private static double average(int[] list) {
        System.out.println("This is average method for integers ");

        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / 10.0;
    }
}
