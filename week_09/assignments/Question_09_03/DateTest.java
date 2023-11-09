package week_09.assignments.Question_09_03;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {

        Date date1;

        for (int i = 0; i <= 6; i++) {
            long elapsedTime = (long) (100000 * Math.pow(10, i));
            date1 = new Date(elapsedTime);
            System.out.println("For elapsed " + elapsedTime + " time is " + date1);
        }
    }
}
