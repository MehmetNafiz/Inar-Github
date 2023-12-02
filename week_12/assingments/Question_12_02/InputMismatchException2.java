package week_12.assingments.Question_12_02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchException2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        double sum;

        System.out.println("Enter two integers to sum");

        boolean isMismatch;
        do {
            isMismatch = false;
            try {

                number1 = input.nextDouble();
                number2 = input.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input!! Please enter integer -->");
                isMismatch = true;
                input.next();
            }
            System.out.println();
        }while (isMismatch);

        sum = number1 + number2;
        System.out.println("Sum of " + number1 + " + " + number2 + " is " + sum);

    }
}
