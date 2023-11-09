package week_09.assignments.Question_09_05;

import java.util.GregorianCalendar;

public class GregorianCalenderTest {
    public static void main(String[] args) {


        GregorianCalendar day1 = new GregorianCalendar();

        System.out.println("Current year: " + day1.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + day1.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + day1.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println();
        day1.setTimeInMillis(1234567898765L);

        System.out.println("After setTime");
        System.out.println("Current year: " + day1.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + day1.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + day1.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
