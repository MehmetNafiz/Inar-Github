package week_05.assigments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vowels = 0;
        int consonants = 0;
        System.out.println("Enter a string:");
        String sentence = input.nextLine();
        sentence = sentence.toUpperCase();

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);

            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                vowels++;
            else
                consonants++;
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);

    }
}
