package week_05.live_class;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        String s = "";

        for (int i = word.length()-1; i >= 0; i--) {
            s += word.charAt(i);
        }
        if (word.equals(s))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");


    }
}
