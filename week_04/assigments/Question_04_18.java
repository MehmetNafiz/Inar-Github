package week_04.assigments;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters:");
        String characters = input.nextLine();

        char firstCharacter = characters.charAt(0);
        int secondInt =Integer.parseInt(characters.substring(1));

        if (firstCharacter != 'M' && firstCharacter != 'C' && firstCharacter != 'I'
        && (secondInt <= 1 || secondInt >= 3))
            System.out.println("Invalid input");

        if (firstCharacter == 'M')
            System.out.print("Mathematics ");
        else if (firstCharacter == 'C')
            System.out.print("Computer Science ");
        else if (firstCharacter == 'I')
            System.out.print("Information Technology");

        if (secondInt == 1)
            System.out.println("Freshman");
        else if (secondInt == 2)
            System.out.println("Sophomore");
        else if (secondInt == 3)
            System.out.println("Junior");
        else if (secondInt == 4)
            System.out.println("Senior");
    }
}
