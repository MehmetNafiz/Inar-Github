package week_08.assingments;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        double[][] line1 = new double[2][2];
        double[][] line2 = new double[2][2];
        double[] intersectionPoint;

        fillLineArray(line1);
        fillLineArray(line2);

        intersectionPoint = getIntersectionPoint(line1,line2);

        displayResults(intersectionPoint);
    }

    private static void fillLineArray(double[][] line) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinates of line");

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                line[i][j] = input.nextDouble();
            }
        }
    }

    private static double[] getIntersectionPoint(double[][] line1, double[][] line2) {
        double[] intersectionPoint = new double[2];

        double a = line1[0][1] - line1[1][1];
        double b = -(line1[0][0] - line1[1][0]);
        double c = line2[0][1] - line1[1][1];
        double d = -(line2[0][0] - line1[1][0]);

        double e = (line1[0][1] - line1[1][1]) * line1[0][0] - (line1[0][0] - line1[1][0]) * line1[0][1];
        double f = (line2[0][1] - line2[1][1]) * line2[0][0] - (line2[0][0] - line2[1][0]) * line2[0][1];


        double xOfIntertection = (e * d - b * f) / (a * d - b * c);
        double yOfIntertection = (a * f - e * c) / (a * d - b * c);

        intersectionPoint[0] = xOfIntertection;
        intersectionPoint[1] = yOfIntertection;

        return intersectionPoint;
    }

    private static void displayResults(double[] intersectionPoint) {
        if(intersectionPoint != null)
            System.out.printf("The intersection point is at (%.3f,%.3f)",
                intersectionPoint[0], intersectionPoint[1]);
        else
            System.out.println("The two lines are parallel");
    }
}
