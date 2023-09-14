package week_05.assigments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = input.nextInt();

        System.out.println("Enter first day of the year:");
        int day = input.nextInt();
        int blank = day;
        int numberOfDay = 0;
        String nameOfMonth = "";

        for (int month = 1; month <= 12 ; month++) {

            switch (month) {
                case 1:
                    numberOfDay = 31;
                    nameOfMonth = "January";
                    break;

                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0)
                        numberOfDay = 29;
                    else
                        numberOfDay = 28;
                    nameOfMonth = "February";
                    break;

                case 3:
                    numberOfDay = 31;
                    nameOfMonth = "March";
                    break;

                case 4:
                    numberOfDay = 30;
                    nameOfMonth = "April";
                    break;

                case 5:
                    numberOfDay = 31;
                    nameOfMonth = "May";
                    break;

                case 6:
                    numberOfDay = 30;
                    nameOfMonth = "June";
                    break;

                case 7:
                    numberOfDay = 31;
                    nameOfMonth = "July";
                    break;

                case 8:
                    numberOfDay = 31;
                    nameOfMonth = "August";
                    break;

                case 9:
                    numberOfDay = 30;
                    nameOfMonth = "September";
                    break;

                case 10:
                    numberOfDay = 31;
                    nameOfMonth = "October";
                    break;

                case 11:
                    numberOfDay = 30;
                    nameOfMonth = "November";
                    break;

                case 12:
                    numberOfDay = 31;
                    nameOfMonth = "December";
                    break;
            }

            System.out.println(nameOfMonth + " " + year);
            System.out.println("---------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            for (int i = 1; i <= day % 7; i++) {
                System.out.print("      ");
            }
            for (int i = 1; i <= numberOfDay ; i++) {
                if(i < 10)
                    System.out.print(" " + i + "    ");
                else
                    System.out.print(i + "    ");
                day++;
                if (day % 7 == 0)
                    System.out.println("");

            }
            System.out.printf("\n\n");
        }
    }
}
