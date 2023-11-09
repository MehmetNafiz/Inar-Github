package week_09.assignments.Question_09_01;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("The width of rectangle1 is " + rectangle1.width);
        System.out.println("The height of rectangle1 is " + rectangle1.height);
        System.out.println("The area of the rectangle1 is " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle1 is " + rectangle1.getPerimeter());

        System.out.println("The width of rectangle2 is " + rectangle2.width);
        System.out.println("The height of rectangle2 is " + rectangle2.height);
        System.out.println("The area of the rectangle2 is " + rectangle2.getArea());
        System.out.println("The perimeter of the rectangle2 is " + rectangle2.getPerimeter());


    }

}
