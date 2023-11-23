package week_10.live_class;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter year:");
        int year = input.nextInt();

        System.out.println("Enter amount:");
        double amount = input.nextDouble();

        Loan loanObject = new Loan(annualInterestRate, year, amount);
        System.out.println("Monthly Payment : " + loanObject.getMonthlyPayment());
        System.out.println("Total Payment : " + loanObject.getTotalPayment());

        System.out.println("Date : " + loanObject.getLoanDate());
    }
}
