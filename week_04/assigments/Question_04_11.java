package week_04.assigments;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to  15):");

        String hexString = input.nextLine();
        int hexInt = Integer.parseInt(hexString);

        if (hexInt >= 0 && hexInt <= 9)
            System.out.println("The hex value is " + hexInt);
        else if (hexInt >= 10 && hexInt <=15)
            System.out.println("The hex value is " + (char)(65 + (hexInt)/7));
        else
            System.out.println(hexInt + " is an invalid input");

    }
}
