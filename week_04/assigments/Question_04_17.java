package week_04.assigments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month:");
        String month = input.nextLine();

        System.out.println("Enter a year:");
        int year = input.nextInt();

                int dayOfFeb = 28;
        if ((year %4 == 0 && year % 100 !=0) ||(year % 400) == 0)
            dayOfFeb++;

        if (month.equals("Jan"))
            System.out.println(month + " " + year + " has 31 days");
        else if (month.equals("Feb"))
            System.out.println(month + " " + year + " has " + dayOfFeb + " days");
        else if (month.equals("Mar"))
            System.out.println(month + " " + year + " has 31 days");
        else if (month.equals("Apr"))
            System.out.println(month + " " + year + " has 30 days");
        else if (month.equals("May"))
            System.out.println(month + " " + year + " has 31 days");
        else if (month.equals("Jun"))
            System.out.println(month + " " + year + " has 30 days");
        else if (month.equals("Jul"))
            System.out.println(month + " " + year + " has 31 days");
        else if (month.equals("Aug"))
            System.out.println(month + " " + year + " has 31 days");
        else if (month.equals("Sep"))
            System.out.println(month + " " + year + " has 30 days");
        else if (month.equals("Oct"))
            System.out.println(month + " " + year + " has 31 days");
        else if (month.equals("Nov"))
            System.out.println(month + " " + year + " has 30 days");
        else if (month.equals("Dec"))
            System.out.println(month + " " + year + " has 31 days");
        else
            System.out.println("Invalid input");
    }
}
