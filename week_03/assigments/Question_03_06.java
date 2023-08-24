package week_03.assigments;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();

        System.out.println("Enter feet:");
        double feet = input.nextDouble();

        System.out.println("Enter inches:");
        double inches =  input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet*12+inches) * METERS_PER_INCH;
        double bmi = weightInKilograms / Math.pow(heightInMeters,2);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
        System.out.println("Obese");
    }
}
