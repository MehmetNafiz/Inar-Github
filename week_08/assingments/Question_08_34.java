package week_08.assingments;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        double[][] points = new double[6][2];
        fillArray(points);

        double[] point = getRightMostLowestPoint(points);
        displayRightMost(point);
    }

    private static void displayRightMost(double[] point) {
            System.out.printf("The rightmost lowest points is (%.1f,%.1f)", point[0], point[1]);

    }

    private static void fillArray(double[][] points) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 6 points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
    }

    public static double[] getRightMostLowestPoint(double[][] p) {

        double[] rightMost;
        rightMost = p[0];

        for (int i = 1; i < p.length; i++) {

            if (p[i][1] < rightMost[1]) {

                rightMost = p[i];
            } else if (p[i][1] == rightMost[1] && p[i][0] > rightMost[0]) {

                rightMost = p[i];
            }
        }
        return new double[] {rightMost[0], rightMost[1]};

    }
}
