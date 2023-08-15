package week_02.assigments;
import java.util.Scanner;
public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double pound = input.nextDouble();

        System.out.println("Enter height in inches:");
        double height = input.nextDouble();

        double bmi = (pound*0.45359237)/Math.pow((height*0.0254),2);

        System.out.println("BMI is "+(int)(bmi*10000)/10000.0);
    }
}
