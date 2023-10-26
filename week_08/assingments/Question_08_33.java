package week_08.assingments;

import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        double areaOfVertex;
        double[][] pointsOfVertex = new double[4][2];
        double[][] centralPoint;

        getPointsOfVertex(pointsOfVertex);
        centralPoint = computeCentralPoint(pointsOfVertex);
        double[] areaOfTriangles = getArea(pointsOfVertex, centralPoint);

        displayResults(areaOfTriangles);
    }

    private static double[] getArea(double[][] pointsOfVertex, double[][] centralPoint) {
        double[] triangleAreaList = new double[4];

        for (int i = 0; i < pointsOfVertex.length; i++) {
            double x1 = pointsOfVertex[i][0];
            double y1 = pointsOfVertex[i][1];
            double x2 = pointsOfVertex[(i % 3) + 1][0];
            double y2 = pointsOfVertex[(i % 3) + 1][0];

            double[][] currentPoints = {
                    {x1,y1},
                    {x2,y2},
                    {centralPoint[0][0],centralPoint[0][1]}
            };
            triangleAreaList[i] = getTriangleArea(currentPoints);
        }
        return triangleAreaList;
    }

    private static double[][] computeCentralPoint(double[][] pointsOfVertex) {
            double[][] centralPoint = new double[1][2];

            double a = pointsOfVertex[0][1] - pointsOfVertex[2][1];
            double b = -(pointsOfVertex[0][0] - pointsOfVertex[2][0]);
            double c = pointsOfVertex[1][1] - pointsOfVertex[3][1];
            double d = -(pointsOfVertex[1][0] - pointsOfVertex[3][0]);

            double e = (pointsOfVertex[0][1] - pointsOfVertex[2][1]) * pointsOfVertex[0][0] - (pointsOfVertex[0][0] - pointsOfVertex[2][0]) * pointsOfVertex[0][1];
            double f = (pointsOfVertex[1][1] - pointsOfVertex[3][1]) * pointsOfVertex[1][0] - (pointsOfVertex[2][0] - pointsOfVertex[3][0]) * pointsOfVertex[1][1];


            double xOfIntertection = (e * d - b * f) / (a * d - b * c);
            double yOfIntertection = (a * f - e * c) / (a * d - b * c);

            centralPoint[0][0] = xOfIntertection;
            centralPoint[0][1] = yOfIntertection;

            return centralPoint;
    }

    private static void getPointsOfVertex(double[][] pointsOfVertex) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter points of triangle(x1,y1,x2,y2,x3,y3");
        for (int i = 0; i < pointsOfVertex.length; i++) {
            for (int j = 0; j < pointsOfVertex[i].length; j++) {
                pointsOfVertex[i][j] = input.nextDouble();
            }
        }
    }

    private static double getTriangleArea(double[][] pointsOfTriangle) {

        double area;
        double s;

        double side1 = Math.sqrt(Math.pow(pointsOfTriangle[0][0] - pointsOfTriangle[1][0],2)
                + Math.pow(pointsOfTriangle[0][1] - pointsOfTriangle[1][1],2));
        double side2 = Math.sqrt(Math.pow(pointsOfTriangle[1][0] - pointsOfTriangle[2][0],2)
                + Math.pow(pointsOfTriangle[1][1] - pointsOfTriangle[2][1],2));
        double side3 = Math.sqrt(Math.pow(pointsOfTriangle[0][0] - pointsOfTriangle[2][0],2)
                + Math.pow(pointsOfTriangle[0][1] - pointsOfTriangle[2][1],2));

        s = (side1 + side2 + side3) / 2;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }

    private static boolean isOnSameLine(double[][] pointsOfTriangle) {
        double condition = (pointsOfTriangle[1][0] - pointsOfTriangle[0][0]) * (pointsOfTriangle[2][1] - pointsOfTriangle[0][1])
                - (pointsOfTriangle[2][0] - pointsOfTriangle[0][0]) * (pointsOfTriangle[1][1] - pointsOfTriangle[0][1]);

        if(condition == 0)
            return true;
        else
            return false;
    }

    private static void displayResults(double[] areaOfTriangles) {
        System.out.print("The areas are ");

        for (int i = 0; i < areaOfTriangles.length; i++) {
            System.out.printf("%.2f ", areaOfTriangles[i]);
        }
    }
}
