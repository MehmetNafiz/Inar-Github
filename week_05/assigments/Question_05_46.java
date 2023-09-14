package week_05.assigments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reversedWord = "";

        System.out.println("Enter a string:");
        String word = input.nextLine();

        for (int i = word.length()-1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("The reversed string is " + reversedWord);

    }
}
