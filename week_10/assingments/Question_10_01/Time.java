package week_10.assingments.Question_10_01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        long time = System.currentTimeMillis();
        this.setTime(time);
    }

    public Time(long specifiedTime){
        this.setTime(specifiedTime);
    }

    public Time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setTime(long time){
        hour = (int)((time / (60 * 60 * 1000)) % 24);
        minute = (int)((time / (60 * 1000)) % 60);
        second = (int)((time / (1000)) % 60);
    }


}
