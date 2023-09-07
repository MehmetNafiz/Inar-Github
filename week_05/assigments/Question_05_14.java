package week_05.assigments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int number1 = input.nextInt();;

        System.out.println("Enter second integer:");
        int number2 = input.nextInt();

        int gcd = 1;
        int divisor = 2;

        while (divisor <= number1 && divisor <= number2){
            if(number1 % divisor == 0 && number2 % divisor == 0){
                gcd = divisor;
            }
            divisor++;
        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2
                + " is " + gcd);
    }
}
