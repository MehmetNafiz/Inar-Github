package week_05.assigments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal integer:");
        int decimalValue = input.nextInt();

        int octalValue = (decimalValue / 8) * 10 + (decimalValue % 8);

        System.out.println("The octal of " + decimalValue + " is " + octalValue);


    }
}
