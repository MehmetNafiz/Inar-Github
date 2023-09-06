package week_04.assigments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter:");
        char character = input.nextLine().charAt(0);
        int characterInt = (int)character;

        if(Character.isLetter(character)){
            if (characterInt == 65 || characterInt == 97
                    || characterInt == 69 || characterInt == 101
                    || characterInt == 73 || characterInt == 105
                    || characterInt == 79 || characterInt == 111
                    || characterInt == 85 || characterInt == 117)
                        System.out.println(character + " is a vowel");
            else if (characterInt >= 65 && characterInt <= 90
                    || characterInt >= 97 && characterInt <= 122)
                        System.out.println(character + " is a consonant");}
        else
            System.out.println(character + " is an invalid input");
    }
}
