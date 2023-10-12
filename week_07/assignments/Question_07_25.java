package week_07.assignments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double [3];
        double[] roots = new double [2];

        System.out.println("Enter a, b, c:");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextInt();
        }

        roots = solveQuadratic(eqn, roots);
        displayList(roots);
    }


    private static double[] solveQuadratic(double[] eqn, double[] roots) {
        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];

        if (discriminant == 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
        } else if (discriminant > 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / (2 * eqn[0]);
        }
        return roots;
    }

    private static void displayList(double[] roots) {
        if (roots[0] == 0)
            System.out.println("The equation has no real root");
        else {
            System.out.print("The root(s) of equation: ");
            for (int i = 0; i < roots.length; i++) {
                if (roots[i] != 0)
                    System.out.print(roots[i] + "  ");

            }
        }
    }
}
