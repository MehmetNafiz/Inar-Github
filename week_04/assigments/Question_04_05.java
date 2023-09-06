package week_04.assigments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        System.out.println("Enter the side: ");
        double legthOfASide = input.nextDouble();

        double area = (numberOfSides * Math.pow(legthOfASide, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of polygon is " + area);
    }
}
