package week_05.assigments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount : ");
        int amount = input.nextInt();

        System.out.print("Number of years : ");
        int year = input.nextInt();

        System.out.print("Annual interest rate : ");
        double annualInterestRate = input.nextInt();


        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        double monthlyPayment = (amount * monthlyInterestRate) /
                (1 - (1 / Math.pow((1 + monthlyInterestRate), (year * 12))));

        System.out.printf("Monthly Payment : %.2f\n", monthlyPayment);

        double totalPayment = monthlyPayment * 12 * year;
        System.out.printf("Total Payment : %.2f\n", totalPayment);

        double balance = amount;

        System.out.println("Payment#\tInterest\t\tPrincipal\t\tBalance");

        for (int i = 1; i <= 12 * year; i++) {

            double monthlyInterest = balance * monthlyInterestRate;
            double principal = monthlyPayment - monthlyInterest;

            balance -= principal;

            System.out.printf("%2d\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", i, monthlyInterest,
                    principal, balance);

        }
    }
}
