package week_05.assigments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.println("Enter a string:");
        String sentence = input.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            if(Character.isUpperCase(sentence.charAt(i)))
                counter++;
        }

        System.out.println("The number of uppercase letters is " + counter);
    }
}
