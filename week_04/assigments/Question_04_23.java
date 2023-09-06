package week_04.assigments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name:");
        String name = input.nextLine();
        System.out.println("Enter number of hours worked in a week:");
        int hour = input.nextInt();
        System.out.println("Enter hourly pay rate:");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double stateTax = input.nextDouble();

        double grossPay = hour * payRate;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("********************************");

        System.out.printf("Employee Name: %s \nHours Worked: %d \nPayRate: $%.2f \n" +
                "Gross Pay: $%.1f \nDeductions: \n\tFederal Withholding (%.2f%%): $%.2f \n\t" +
                "State Withholding (%.2f%%): $%.2f \n\tTotal Deduciton: $%.2f \nNet pay: $%.2f",
                name, hour, payRate, grossPay, federalTax, federalWithholding, stateTax, stateWithholding, totalDeduction, netPay);

    }
}
