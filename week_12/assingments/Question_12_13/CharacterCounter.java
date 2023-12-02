package week_12.assingments.Question_12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        File sourceFile = new File(args[0]);


        if (!sourceFile.exists()) {
            System.out.println(sourceFile.getName() + " is not exist.");
            System.exit(1);
        }
        String currentLine = "";

        int numberOfCharacters = 0;
        int numberOfWords = 0;
        int numberOfLines = 0;

        try {
            Scanner input = new Scanner(sourceFile);

            while (input.hasNext()) {
                currentLine = input.nextLine();
                numberOfLines++;

                String[] words = currentLine.split(" ");
                numberOfWords += words.length;

                for (int i = 0; i < words.length - 1; i++) {
                    numberOfCharacters += words[i].length();
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File " + sourceFile.getName() + " has");
        System.out.println(numberOfCharacters + " characters");
        System.out.println(numberOfWords + " words");
        System.out.println(numberOfLines + " lines");
    }
}


