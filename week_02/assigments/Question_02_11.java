package week_02.assigments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ne number of years.");
        int year = input.nextInt();
        int population = 312032486 + (year * ((365 * 24 * 60 * 60 / 7) - (365 * 24 * 60 * 60 / 13) + (365 * 24 * 60 * 60 / 45)));
        System.out.println("The population in " + year + " years is " + (population));

    }
}
