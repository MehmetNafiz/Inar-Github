package week_07.assignments;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] zodiacList = {"monkey", "rooster", "dog", "pig", "rat",
                "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println("Enter a year");
        int year = input.nextInt();

        displayZodiacYear(zodiacList,year);
    }

    private static void displayZodiacYear(String[] zodiacList, int year) {
        System.out.println(year + " is a year of " + zodiacList[year % 12] + " in zodiac");

    }
}
