package week_05.assigments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prefix = "";
        int counter = 0;

        System.out.println("Enter the first string:");
        String string1 = input.nextLine();

        System.out.println("Enter the second string:");
        String string2 = input.nextLine();

        while (string1.charAt(counter) == string2.charAt(counter)) {
            prefix += string1.charAt(counter);
            counter++;
        }

        if (prefix.equals(""))
            System.out.println(string1 + " and " + string2 + " have no common prefix" );
        else
            System.out.println("The common prefix is " + prefix);
    }
}
