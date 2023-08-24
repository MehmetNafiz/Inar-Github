package week_03.live_class;

import java.util.Scanner;
public class live_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius ->");
        double radius = input.nextDouble();

        double area = 0;
        if (radius < 0) {
            System.out.println("Incorrect input");
        } else {
            area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }

    }
}
