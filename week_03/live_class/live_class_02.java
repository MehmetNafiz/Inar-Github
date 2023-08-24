package week_03.live_class;

import java.util.Scanner;
public class live_class_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius->");
        double radius = input.nextDouble();

        boolean positiveRadius = (radius == 5);

        System.out.println("Is 5->"+ radius);
    }
}
