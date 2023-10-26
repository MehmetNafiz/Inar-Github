package week_08.assingments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numberOfPoints = input.nextInt();
        double number[][] = new double[numberOfPoints][2];

        fillArray(number);
        double closestDistance = computeClosestDistance(number);
        displayClosestNumbers(number, closestDistance);


    }

    private static double computeClosestDistance(double[][] number) {
        double closestDistance = 100;   //A Random Big Number

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (Math.sqrt(Math.pow(number[i][0] - number[j][0], 2)) + Math.pow(number[i][0] - number[j][0], 2) < closestDistance)
                    closestDistance = Math.sqrt(Math.pow(number[i][0] - number[j][0], 2)) + Math.pow(number[i][0] - number[j][0], 2);
            }
        }
        return closestDistance;
    }

    private static void displayClosestNumbers(double[][] number, double closestDistance) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (Math.sqrt(Math.pow(number[i][0] - number[j][0], 2)) + Math.pow(number[i][0] - number[j][0], 2) == closestDistance)
                    System.out.println("The closest two points are " +
                            "(" + number[i][0] + "," + number[i][1] + ") and " +
                            "(" + number[j][0] + "," + number[j][1] + ")");
            }
        }
    }

    public static void fillArray(double[][] number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 8 points:");

        for (int i = 0; i < number.length; i++) {
            number[i][0] = input.nextDouble();
            number[i][1] = input.nextDouble();
        }
    }
}
