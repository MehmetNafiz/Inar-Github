package week_04.assigments;

import java.util.Scanner;

public class Question_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side:");
        double lenghtOfASide = input.nextDouble();

        double area = (6 * Math.pow(lenghtOfASide,2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagen is " + (int)(area * 100)/100.0);
    }
}
