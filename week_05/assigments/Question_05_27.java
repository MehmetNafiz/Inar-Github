package week_05.assigments;

public class Question_05_27 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("All the leap years from 101 to 2100:");
        for (int year = 101; year <= 2100 ; year++) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            if (isLeapYear) {
                System.out.print(year + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println("");
            }
        }
    }
}
