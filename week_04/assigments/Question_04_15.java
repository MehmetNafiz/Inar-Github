package week_04.assigments;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter:");
        String letter = input.nextLine();
        char charLetter = letter.charAt(0);
        int number;

        if (charLetter >= 65 && charLetter <= 67 || charLetter >= 97 && charLetter <= 99)
            System.out.println("The corresponding number is 2");
        else if (charLetter >= 68 && charLetter <= 70 || charLetter >= 100 && charLetter <= 102)
            System.out.println("The corresponding number is 3");
        else if (charLetter >= 71 && charLetter <= 73 || charLetter >= 103 && charLetter <= 105)
            System.out.println("The corresponding number is 4");
        else if (charLetter >= 74 && charLetter <= 76 || charLetter >= 106 && charLetter <= 108)
            System.out.println("The corresponding number is 5");
        else if (charLetter >= 77 && charLetter <= 79 || charLetter >= 109 && charLetter <= 111)
            System.out.println("The corresponding number is 6");
        else if (charLetter >= 80 && charLetter <= 83 || charLetter >= 112 && charLetter <= 115)
            System.out.println("The corresponding number is 7");
        else if (charLetter >= 84 && charLetter <= 86 || charLetter >= 116 && charLetter <= 118)
            System.out.println("The corresponding number is 8");
        else if (charLetter >= 87 && charLetter <= 90 || charLetter >= 119 && charLetter <= 122)
            System.out.println("The corresponding number is 9");
        else
            System.out.println(letter + "is an invalid input");

    }
}
