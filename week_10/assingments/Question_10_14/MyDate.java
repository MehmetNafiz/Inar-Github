package week_10.assingments.Question_10_14;

import java.util.GregorianCalendar;

public class MyDate {
    GregorianCalendar calendar1 = new GregorianCalendar();
    private int year;
    private int month;
    private int day;


    public MyDate(){
        this(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime){
        calendar1.setTimeInMillis(elapsedTime);
        year = calendar1.get(GregorianCalendar.YEAR);
        month = calendar1.get(GregorianCalendar.MONTH);
        day = calendar1.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
