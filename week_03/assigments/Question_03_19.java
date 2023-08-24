package week_03.assigments;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges(x1,y1,x2,y2,x3,y3) of triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),0.5);
        double side2 = Math.pow(Math.pow((x3-x1),2)+Math.pow((y3-y1),2),0.5);
        double side3 = Math.pow(Math.pow((x3-x2),2)+Math.pow((y3-y2),2),0.5);

        if ((side1 + side2)>side3 &&(side2 + side3)>side1 && (side1 + side3)>side2) {
            double perimeter = (side1 + side2 + side3);
            System.out.println("Perimeter of triangle is "+perimeter);
        }
        else
            System.out.println("The input is invalid");


    }
}
