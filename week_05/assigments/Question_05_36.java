package week_05.assigments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an integer:");
        int ISBN = input.nextInt();
        int number = ISBN;
        int total = 0;

        for (int i = 9; i >= 1 ; i--) {
            int digit = number % 10;
            total = i * digit;
            number /= 10;
        }
        System.out.println("The ISBN-10 number is " + ISBN +
                (total % 11 == 0 ? "X" : total %11));
    }
}
