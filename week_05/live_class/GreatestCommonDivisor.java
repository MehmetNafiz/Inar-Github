package week_05.live_class;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1:");
        int number1 = input.nextInt();;

        System.out.println("Enter number2:");
        int number2 = input.nextInt();

        int gcd = 1;
        int divisor = 2;

        while (divisor <= number1 && divisor <= number2){
            if(number1 % divisor == 0 && number2 % divisor == 0){
                gcd = divisor;
            }
            divisor++;
        }
        System.out.println("Greatest common divisor for " + number1 + " and " + number2
                + " is " + gcd);
    }
}
