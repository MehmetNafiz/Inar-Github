package week_09.assignments.Question_09_10;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        double discriminant = equation1.getDiscriminant();

        if(discriminant < 0)
            System.out.println("The equation has no real roots");
        else if(discriminant == 0)
            System.out.println("The equation has one root \n" + equation1.getRoot1());
        else
            System.out.println("The equation has two roots \n" + equation1.getRoot1()
            + "   " + equation1.getRoot2());
    }
}
