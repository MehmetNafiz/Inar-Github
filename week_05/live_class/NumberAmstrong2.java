package week_05.live_class;

import java.util.Scanner;

public class NumberAmstrong2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = 0;

        while (number != 0){
            number /= 10;
            numberOfDigits++;
        }

        while (numberOfDigits > 1){
            int digit = number % 10;
            sum += (Math.pow(digit,3));
            number /= 10;
            numberOfDigits--;
        }
        if (sum == originalNumber)
            System.out.println(originalNumber + " is an amstrong number");
        else
            System.out.println(originalNumber + " is not an amstrong number");


    }
}
