package week_08.assingments;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double points[][] = new double[5][2];

        System.out.println("Enter 5 points");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (sameLine(points))
            System.out.println("The five points are on the same line");
        else
            System.out.println("The five points are not on the same line");


    }

    private static boolean sameLine(double[][] points) {
        boolean isOnSameLine = true;
        for (int i = 0; i < points.length - 2; i++) {
            double condition =
                    (points[i + 1][0] - points[i][0]) * (points[i + 2][1] - points[i][1]) -
                            (points[i + 2][0] - points[i][0]) * (points[i + 1][1] - points[i][1]);
            if (condition != 0)
                isOnSameLine = false;

        }
        return isOnSameLine;
    }
}
