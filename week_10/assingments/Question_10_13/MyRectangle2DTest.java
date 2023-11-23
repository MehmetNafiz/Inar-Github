package week_10.assingments.Question_10_13;

public class MyRectangle2DTest {
    public static void main(String[] args) {
        MyRectangle2D rec1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
        System.out.println("Contains yhe point(3,3): " + rec1.contains(3,3));
        System.out.println("Does contains the rectangle with points(4,5,10.5,3.2) -->  " + rec1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println("Does overlaps the rectangle with points(3,5,2.3,5.4) -->  " + rec1.overlap(new MyRectangle2D(3,5,2.3,5.4)));

    }
}
