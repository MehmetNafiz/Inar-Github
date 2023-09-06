package week_04.assigments;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade:");
        String gradeString = input.nextLine();
        int gradeInt = gradeString.charAt(0);

        if( gradeInt >= 65 && gradeInt <= 70 && gradeInt != 69){
            if (gradeInt == 65)
                System.out.println("The numeric value for " + gradeString + " is 4");
            else if (gradeInt == 66)
                System.out.println("The numeric value for " + gradeString + " is 3");
            else if (gradeInt == 67)
                System.out.println("The numeric value for " + gradeString + " is 2");
            else if (gradeInt == 68)
                System.out.println("The numeric value for " + gradeString + " is 1");
            else
            System.out.println("The numeric value for " + gradeString + " is 0");
        }
        else
            System.out.println(gradeString + " is an invalid grade");

    }
}
