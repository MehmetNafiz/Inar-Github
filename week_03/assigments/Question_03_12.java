package week_03.assigments;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer:");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int remain = number % 100;
        int thirdDigit = (remain % 10);

        if (firstDigit == thirdDigit)
            System.out.println(number+" is a palindrome");
        else
            System.out.println(number+" is not a palindrome");



    }
}
