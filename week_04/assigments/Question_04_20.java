package week_04.assigments;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String sentence = input.nextLine();

        System.out.println("Length of the string:" + sentence.length());
        System.out.println("First character of the string:" + sentence.charAt(0));
    }
}
