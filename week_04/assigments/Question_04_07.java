package week_04.assigments;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the bounding circle:");
        int radius = input.nextInt();

        int angle = 0;
        double y1 = radius * Math.sin(Math.toRadians(angle));
        double x1 = radius * Math.cos(Math.toRadians(angle));

        angle += 72;
        double y2 = radius * Math.sin(Math.toRadians(angle));
        double x2 = radius * Math.cos(Math.toRadians(angle));


        angle += 72;
        double y3 = radius * Math.sin(Math.toRadians(angle));
        double x3 = radius * Math.cos(Math.toRadians(angle));

        angle += 72;
        double y4 = radius * Math.sin(Math.toRadians(angle));
        double x4 = radius * Math.cos(Math.toRadians(angle));

        angle += 72;
        double y5 = radius * Math.sin(Math.toRadians(angle));
        double x5 = radius * Math.cos(Math.toRadians(angle));

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.println("(" + x1 + "," + y1 + ")");
        System.out.println("(" + x2 + "," + y2 + ")");
        System.out.println("(" + x3 + "," + y3 + ")");
        System.out.println("(" + x4 + "," + y4 + ")");
        System.out.println("(" + x5 + "," + y5 + ")");


        System.out.println(x1+"  "+y1);


    }
}
