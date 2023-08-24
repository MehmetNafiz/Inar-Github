package week_03.assigments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        int timeZone = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + timeZone) % 24;

        if (currentHour /12 == 1)
            System.out.println("Current time is " + (currentHour%12) + ":" + currentMinute + ":" + currentSecond + " PM GMT");
        else
            System.out.println("Current time is " + (currentHour) + ":" + currentMinute + ":" + currentSecond + " AM GMT");
    }
}
