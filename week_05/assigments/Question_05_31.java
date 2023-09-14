package week_05.assigments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount:");
        double amount = input.nextInt();

        System.out.println("Enter annual percentage yield:");
        double annualYield = input.nextDouble();

        System.out.println("Enter maturity period (number of months):");
        int numberOfMonths = input.nextInt();

        System.out.println("Month CD Value");

        double monthlyYield = annualYield / 1200;
        for (int i = 1; i <= numberOfMonths ; i++) {
            amount += amount * monthlyYield;
            System.out.printf("%2d ->  %.2f\n", i, amount);

        }
    }
}
