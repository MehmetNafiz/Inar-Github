package week_04.assigments;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code (Between 0-127):");
        int asciiCode = input.nextInt();

        System.out.println("The character for ASCII code " + asciiCode + " is " + (char)asciiCode);
    }
}
