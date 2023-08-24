package week_03.assigments;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: (e.g., 2012):");
        int year = input.nextInt();

        System.out.println("Enter month: 1-12:");
        int month = input.nextInt();

        if(month == 1) {
            month = 13;
            year--;
        }
        if(month == 2) {
            month = 14;
            year--;
        }

        System.out.println("Enter the day of the month: 1-31:");
        int day = input.nextInt();
        System.out.println(month);
        System.out.println(year);
        int dayOfWeek = (day + (26 * (month+1))/10 + (year%100) + ((year%100)/4) + ((year/100)/4) + (year/20))%7;

        System.out.println(dayOfWeek);

    }
}
