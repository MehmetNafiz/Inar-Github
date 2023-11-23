package week_10.assingments.Question_10_15;

import week_10.assingments.Question_10_13.MyRectangle2D;

import java.util.Scanner;

public class BoundingRectangle {
    public static void main(String[] args) {
        MyRectangle2D rectangle1;
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x of " + (i + 1) + ". point: ");
            points[i][0] = input.nextDouble();

            System.out.print("Enter y of " + (i + 1) + ". point: ");
            points[i][1] = input.nextDouble();

            System.out.println("************************");
        }

        rectangle1 = getRectangle(points);

        System.out.println("The bounding rectangle's center (" + rectangle1.getX() + "," + rectangle1.getY() +
                "), width " + rectangle1.getWidth() + ", height " + rectangle1.getHeight());
    }


    public static MyRectangle2D getRectangle(double[][] points){
        double max_X = points[0][0];
        double min_X = points[0][0];

        double max_Y = points[0][1];
        double min_Y = points[0][1];


        for (int i = 0; i < points.length; i++) {
            if(points[i][0] > max_X)
                max_X = points[i][0];
            if(points[i][0] < min_X)
                min_X = points[i][0];

            if(points[i][1] > max_Y)
                max_Y = points[i][1];
            if(points[i][1] < min_Y)
                min_Y = points[i][1];
        }

        double xOfCenter = min_X + (max_X - min_X) / 2;
        double yOfCenter = min_Y + (max_Y - min_Y) / 2;
        double width = max_X - min_X;
        double height = max_Y - min_Y;

        return new MyRectangle2D(xOfCenter, yOfCenter, width,height);
    }
}
