package week_11.assingments.Question_11_01;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1, side2, side3;

        System.out.println("Enter three side of the triangle: ");
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();

        Triangle obj1 = new Triangle(side1, side2, side3);

        System.out.println("Enter a color");
        obj1.setColor(input.next());
        obj1.setFilled(true);

        System.out.println("Is the triangle filled (true/false)? " + obj1.isFilled());
        System.out.println(obj1);
        System.out.println("Area: " + obj1.getArea());
        System.out.println("Perimeter: " + obj1.getPerimeter());
        System.out.println("Color: " + obj1.getColor());
        if(obj1.isFilled())
            System.out.println("Triangle is filled");
        else
            System.out.println("Triangle is not filled");

    }
}
