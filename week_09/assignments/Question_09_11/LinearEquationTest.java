package week_09.assignments.Question_09_11;

import java.util.Scanner;

public class LinearEquationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f;

        System.out.println("Enter a, b, c, d, e, f");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        LinearEquation equation1 = new LinearEquation(a, b, c, d, e, f);

        if (equation1.isSolvable())
            System.out.println("x is " + equation1.getX() + " and y is " + equation1.getY());
        else
            System.out.println("The equation has no solution");
    }
}
