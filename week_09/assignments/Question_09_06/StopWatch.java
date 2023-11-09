package week_09.assignments.Question_09_06;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        long elapsedTime = endTime - startTime;
        return elapsedTime;
    }





}
