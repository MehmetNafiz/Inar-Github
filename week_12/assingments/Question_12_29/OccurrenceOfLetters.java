package week_12.assingments.Question_12_29;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OccurrenceOfLetters {
    public static void main(String[] args) {
        int[] occurrences = new int[26];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");


        File file = new File("C:\\Users\\mehme\\WorkSpace\\inar-java\\src\\week_12\\assingments\\Question_12_29\\Text1.txt");

        if (!file.exists()) {
            System.out.println("File does not exist...");
            return;
        }
        try (Scanner fileIn = new Scanner(file)) {
            while (fileIn.hasNext()) {
                String str = fileIn.next();
                for (char ch : str.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        occurrences[(Character.toUpperCase(ch) - 65)]++; /* Example: (A - 65) = 0, so int[0]++ */
                    }
                }
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        input.close();

        for (int i = 0; i < occurrences.length; i++) {
            char ch = (char) (i + 65);
            System.out.println("Number of " + ch + "'s: " + occurrences[i]);
        }
    }
}

