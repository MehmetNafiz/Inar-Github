package week_04.assigments;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = input.nextLine().charAt(0);
        System.out.println("The Unicode for the character " + character + " is " + (int)character);
    }
}
