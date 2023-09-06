package week_04.assigments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first ) digits of an ISBN as Integer");
        String ISBN_10 = input.nextLine();

        int checkSum = (ISBN_10.charAt(0) - 48) * 1;
        checkSum += (ISBN_10.charAt(1) - 48) * 2;
        checkSum += (ISBN_10.charAt(2) - 48) * 3;
        checkSum += (ISBN_10.charAt(3) - 48) * 4;
        checkSum += (ISBN_10.charAt(4) - 48) * 5;
        checkSum += (ISBN_10.charAt(5) - 48) * 6;
        checkSum += (ISBN_10.charAt(6) - 48) * 7;
        checkSum += (ISBN_10.charAt(7) - 48) * 8;
        checkSum += (ISBN_10.charAt(8) - 48) * 9;

        int lastNumber = checkSum % 11;
        if (lastNumber == 10)
            System.out.println("The ISBN-10 number is " + ISBN_10 + "X");
        else System.out.println("The ISBN-10 number is " + ISBN_10 + lastNumber);

    }
}
