package week_03.assigments;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount, 1156 for 11.56: ");
        int amount = input.nextInt();

        int numberOfOneDollars = amount / 100;
        int remainingAmount = amount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount consist of");

        if (numberOfOneDollars == 0);
        else if (numberOfOneDollars == 1)
            System.out.println(numberOfOneDollars+" dollar");
        else
            System.out.println(numberOfOneDollars+ " dollars");

        if (numberOfQuarters == 0);
        else if (numberOfQuarters == 1)
            System.out.println(numberOfQuarters+" quarters");
        else
            System.out.println(numberOfOneDollars+ " quarters");

        if (numberOfDimes == 0);
        else if (numberOfDimes == 1)
            System.out.println(numberOfDimes+" dimes");
        else
            System.out.println(numberOfDimes+ " dimes");

        if (numberOfNickels == 0);
        else if (numberOfNickels == 1)
            System.out.println(numberOfNickels+" nickels");
        else
            System.out.println(numberOfOneDollars+ " nickels");

        if (numberOfPennies == 0);
        else if (numberOfPennies == 1)
            System.out.println(numberOfPennies+" pennies");
        else
            System.out.println(numberOfPennies+ " pennies");



    }
}
