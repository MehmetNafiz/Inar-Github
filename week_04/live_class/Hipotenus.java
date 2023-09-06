package week_04.live_class;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two side of the triangle:");
        int side1 = input.nextInt();
        int side2 = input.nextInt();

        double hypotenus = Math.sqrt( Math.pow(side1,2) + Math.pow(side2,2));

        System.out.println("The hypotenuse of a triangle with the following edge " + side1 + " and " + side2 + " is " + hypotenus);
        System.out.printf("The hypotenuse of a triangle with the following edge %d and %d is %.2f", side1, side2, hypotenus);
    }
}
