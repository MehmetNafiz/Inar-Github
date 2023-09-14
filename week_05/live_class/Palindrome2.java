package week_05.live_class;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.nextLine();

        int frontChar = 0;
        int endChar = word.length()-1;
        boolean isPalindrome = true;

        while ( frontChar < endChar){
            if(word.charAt(frontChar) != word.charAt(endChar)){
                isPalindrome = false;
            }
            frontChar++;
            endChar--;
        }
        if (isPalindrome)
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}
