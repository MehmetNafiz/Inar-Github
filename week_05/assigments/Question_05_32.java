package week_05.assigments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 9);
        while (number1 == 0) {
            number1 = (int) (Math.random() * 9);
        }

        int number2 = (int) (Math.random() * 9);
        while (number2 == number1) {
            number2 = (int) (Math.random() * 9);
        }

        System.out.println("Enter your lottery pick (two distinct digits):");
        int guess1 = input.nextInt();
        int guess2 = input.nextInt();

        System.out.println("The lottery number is " + number1 + number2);

        if (guess1 == number1 && guess2 == number2)
            System.out.println("Exact match: you win $10000");
        else if (guess1 == number2 && guess2 == number1)
            System.out.println("Match two digits : you win $3000");
        else if (guess1 == number1 || guess1 == number2 || guess2 == number1 || guess2 ==number2)
            System.out.println("Match one digit : you win $1000");
        else
            System.out.println("Sorry no match");


    }
}
