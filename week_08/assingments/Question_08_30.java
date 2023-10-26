package week_08.assingments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] coefficients = new double[2][2];
        double[][] results = new double[1][2];

        double[] solution;

        System.out.println("Enter Coefficients(a00,a01,a10,a11");
        fillArray(coefficients);
        System.out.println("Enter Results(b0,b1");
        fillArray(results);

        solution = linearEquation(coefficients, results);

        if(solution != null)
            System.out.println("x is " + solution[0] + " and y is " + solution[1]);
    }

    private static double[] linearEquation(double[][] coefficients, double[][] results) {
        double[] solution = new double[2];

        double x = (results[0][0] * coefficients[1][1] - results[0][1] * coefficients[0][1])
                / (coefficients[0][0] * coefficients[1][1] - coefficients[0][1] * coefficients[1][0]);

        double y = (results[0][1] * coefficients[0][0] - results[0][0] * coefficients[1][0])
                / (coefficients[0][0] * coefficients[1][1] - coefficients[0][1] * coefficients[1][0]);


        if (x != 0 && y != 0) {
            solution[0] = x;
            solution[1] = y;
            return solution;
        }
        return null;
    }

    private static void fillArray(double[][] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
    }
}
