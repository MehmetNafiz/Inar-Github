package week_12.assingments.Question_12_04;

import java.util.Scanner;

public class LoanWithExceptionHandlingTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LoanWithExceptionHandling loan;

        boolean isIllegalArgument;
        double interestRate = 0;
        int year = 0;
        double amount = 0;

        do {
            isIllegalArgument = false;
            try{
                System.out.println("Enter Interest");
                interestRate = input.nextDouble();

                System.out.println("Enter Year");
                year = input.nextInt();

                System.out.println("Enter Amount");
                amount = input.nextDouble();
                loan = new LoanWithExceptionHandling(interestRate, year, amount);
            }
            catch (IllegalArgumentException ex){
                System.out.println("Wrong input! Please greater then 0");
                isIllegalArgument = true;
                input.next();
            }
        }while(isIllegalArgument);


    }
}
