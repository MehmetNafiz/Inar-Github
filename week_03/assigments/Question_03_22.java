package week_03.assigments;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double x = (int)(input.nextDouble()*10)/10.0;
        double y = (int)(input.nextDouble()*10)/10.0;

        double distanceToCenter = Math.pow(Math.pow(x-0,2)+Math.pow(y-0,2),0.5);

        if (distanceToCenter>10)
            System.out.println("Point (" + x + "," + y +") is not in the circle");
        else
            System.out.println("Point (" + x + "," + y +") is in the circle");
    }
}
