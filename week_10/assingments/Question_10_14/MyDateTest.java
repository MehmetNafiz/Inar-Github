package week_10.assingments.Question_10_14;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.printf("Date1: %d/%d/%d", date1.getDay(),date1.getMonth(),date1.getYear());
        System.out.println();
        System.out.printf("Date2: %d/%d/%d", date2.getDay(),date2.getMonth(),date2.getYear());

    }
}
