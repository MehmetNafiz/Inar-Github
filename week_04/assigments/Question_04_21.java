package week_04.assigments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN");
        String SSN = input.nextLine();

        if (Character.isDigit(SSN.charAt(0)) && Character.isDigit(SSN.charAt(1)) && Character.isDigit(SSN.charAt(2)) &&
                Character.isDigit(SSN.charAt(4)) && Character.isDigit(SSN.charAt(5)) && Character.isDigit(SSN.charAt(7)) &&
                Character.isDigit(SSN.charAt(8)) && Character.isDigit(SSN.charAt(9)) && Character.isDigit(SSN.charAt(10)))
            System.out.println(SSN + " is a valid social security number");
        else
            System.out.println(SSN + " is an invalid social security number");


    }
}
