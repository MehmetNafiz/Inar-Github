package week_04.assigments;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex:");
        double lengthCenterToVertex = input.nextDouble();

        double lengthOfASide = 2*lengthCenterToVertex*Math.sin(Math.PI/5);

        double area = (5 * Math.pow(lengthOfASide,2)) / (4 * Math.tan(Math.PI/5));

        System.out.println("The area of the pentagon is " + (int)(area*100)/100.0);

    }
}
