package week_08.assingments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        double areaOfTriangle;
        double[][] pointsOfTriangle = new double[3][2];

        getPointsOfTriangle(pointsOfTriangle);
        areaOfTriangle = getTriangleArea(pointsOfTriangle);

        displayResults(areaOfTriangle);
    }

    private static void getPointsOfTriangle(double[][] pointsOfTriangle) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter points of triangle(x1,y1,x2,y2,x3,y3");
        for (int i = 0; i < pointsOfTriangle.length; i++) {
            for (int j = 0; j < pointsOfTriangle[i].length; j++) {
                pointsOfTriangle[i][j] = input.nextDouble();
            }
        }
    }

    private static double getTriangleArea(double[][] pointsOfTriangle) {
        if(isOnSameLine(pointsOfTriangle))
            return 0.0;


        double areaOfTriangle;
        double s;

        double side1 = Math.sqrt(Math.pow(pointsOfTriangle[0][0] - pointsOfTriangle[1][0],2)
                + Math.pow(pointsOfTriangle[0][1] - pointsOfTriangle[1][1],2));
        double side2 = Math.sqrt(Math.pow(pointsOfTriangle[1][0] - pointsOfTriangle[2][0],2)
                + Math.pow(pointsOfTriangle[1][1] - pointsOfTriangle[2][1],2));
        double side3 = Math.sqrt(Math.pow(pointsOfTriangle[0][0] - pointsOfTriangle[2][0],2)
                + Math.pow(pointsOfTriangle[0][1] - pointsOfTriangle[2][1],2));

        s = (side1 + side2 + side3) / 2;

        areaOfTriangle = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return areaOfTriangle;
    }

    private static boolean isOnSameLine(double[][] pointsOfTriangle) {
        double condition = (pointsOfTriangle[1][0] - pointsOfTriangle[0][0]) * (pointsOfTriangle[2][1] - pointsOfTriangle[0][1])
    - (pointsOfTriangle[2][0] - pointsOfTriangle[0][0]) * (pointsOfTriangle[1][1] - pointsOfTriangle[0][1]);

        if(condition == 0)
            return true;
        else
            return false;
    }

    private static void displayResults(double areaOfTriangle) {
        if (areaOfTriangle == 0)
            System.out.println("The three points are on the same line");
        else
            System.out.printf("The area of the triangle is %.2f", areaOfTriangle);

    }
}
