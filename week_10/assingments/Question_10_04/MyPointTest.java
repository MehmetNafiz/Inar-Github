package week_10.assingments.Question_10_04;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0,0);
        MyPoint point2 = new MyPoint(10,30.5);

        System.out.println("The distance between (0,0) and (10,30.5) is: " + point1.distance(point2));
    }
}
