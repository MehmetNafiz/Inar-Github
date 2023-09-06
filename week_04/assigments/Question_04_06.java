package week_04.assigments;

public class Question_04_06 {
    public static void main(String[] args) {
        final int RADIUS = 40;

        double firstAngle = (Math.random() * (Math.PI * 2));
        double x1 = RADIUS * Math.cos(firstAngle);
        double y1 = RADIUS * Math.sin(firstAngle);

        double secondAngle = (Math.random() * (Math.PI * 2));
        double x2 = RADIUS * Math.cos(secondAngle);
        double y2 = RADIUS * Math.sin(secondAngle);

        double thirdAngle = (Math.random() * (Math.PI * 2));
        double x3 = RADIUS * Math.cos(thirdAngle);
        double y3 = RADIUS * Math.sin(thirdAngle);




    }
}
