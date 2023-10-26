package week_08.assingments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number(0-511):");
        int number = input.nextInt();

        String binaryString = decimalToBinary(number);

        displayHeadsAndTails(binaryString);
    }

    private static String decimalToBinary(int number) {
        String binaryString = "";

        for (int i = 8; i >= 0; i--) {
            if (i == 0 && number == 1) {
                binaryString += "1";
                number--;
            } else if (number / (int) Math.pow(2, i) > 0) {
                if (number % (int) Math.pow(2, i) == 0) {
                    binaryString += "0";
                    number -= (int) Math.pow(2, i);
                } else {
                    binaryString += "1";
                    number -= (int) Math.pow(2, i);
                }
            } else
                binaryString += "0";


        }
        return binaryString;
    }

    private static void displayHeadsAndTails(String binaryString) {
        for (int i = 0; i < binaryString.length(); i++) {
            System.out.print(binaryString.charAt(i) == '0' ? "H " : "T ");

            if (((i + 1) % 3) == 0)
                System.out.println();
        }
    }
}
