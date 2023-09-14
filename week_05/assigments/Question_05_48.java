package week_05.assigments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oddWord = "";

        System.out.println("Enter a string:");
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i += 2) {
            oddWord += word.charAt(i);
        }

        System.out.println(oddWord);
    }
}
