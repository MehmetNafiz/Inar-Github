package week_05.assigments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthlyRate;
        double monthlyPayment;
        double total;
        System.out.println("Loan Amont:");
        double amount = input.nextDouble();

        System.out.println("Number of Years:");
        int years = input.nextInt();


        System.out.println("Interest Rate\t\tMontly Payment\t\tTotal Payment");

        for(double rate = 5.0; rate < 8.0; rate += 0.125){
            monthlyRate = rate / 1200;
            monthlyPayment = (amount * monthlyRate) /(1 - 1 / Math.pow(1 + monthlyRate, years * 12));
            total = monthlyPayment * years * 12;

            System.out.printf("%1.3f%%\t\t\t%6.2f\t\t\t%9.2f\n", rate, monthlyPayment, total);

        }


    }
}
