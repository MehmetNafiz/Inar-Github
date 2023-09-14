package week_05.assigments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        int sumOfNumbers = 0;
        Scanner input = new Scanner(System.in);
        boolean isValid = true;

        System.out.println("Enter the first 12 digits of an ISBN as a string:");
        String ISBN = input.nextLine();

        if (ISBN.length() != 12) {
            isValid = false;
        }

        for (int i = 0; i < 12; i++) {
            if (!Character.isDigit(ISBN.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            for (int i = 0; i < 12; i++) {
                int number = ISBN.charAt(i) - '0';

                if (i % 2 == 0)
                    sumOfNumbers += number;
                else
                    sumOfNumbers += 3 * number;
            }
            System.out.println(sumOfNumbers);
            ISBN += 10 - (sumOfNumbers % 10) == 0 ? "0" : 10 - (sumOfNumbers % 10);

            System.out.println("Number is " + ISBN);
        } else
            System.out.println("Invalid input");

    }
}
