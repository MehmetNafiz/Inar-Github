package week_12.assingments.Question_12_05;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        Triangle2 newTriangle1;

        while(true){
            System.out.println("Enter side1");
            side1 = input.nextDouble();

            System.out.println("Enter side2");
            side2 = input.nextDouble();

            System.out.println("Enter side3");
            side3 = input.nextDouble();

            try{
                newTriangle1 = new Triangle2(side1, side2, side3);
                System.out.println(side1 + "," + side2 + "," + side3 + " is suitable for triangle");
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        }
    }
}
