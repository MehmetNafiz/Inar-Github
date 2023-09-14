package week_05.assigments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthlyInterest = 0;

        System.out.println("Enter an amount (e.g., 100:");
        int amount = input.nextInt();
        double total = 0;
        System.out.println("Enter the annual   interest rate (e.g., 5:");
        int annualInterest = input.nextInt();

        System.out.println("Enter the number of months (e.g., 6):");
        int numberOfMonths = input.nextInt();

        monthlyInterest= 5 / 1200.0;

        for (int i = 1; i <= numberOfMonths ; i++) {
            total = (total + amount) * (1 + monthlyInterest);
        }

        System.out.println("Amount in saving account after " + numberOfMonths + " months: $" + total);
    }
}
