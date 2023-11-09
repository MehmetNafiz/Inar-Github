package week_09.assignments.Question_09_09;

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon RP1 = new RegularPolygon();
        RegularPolygon RP2 = new RegularPolygon(6, 4);
        RegularPolygon RP3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("First RegularPolygon \n\tperimeter is: " + RP1.getPerimeter() +
                "\n\tarea is: " + RP1.getArea());
        System.out.println();
        System.out.println("Second RegularPolygon \n\tperimeter is: " + RP2.getPerimeter() +
                "\n\tarea is: " + RP2.getArea());
        System.out.println();
        System.out.println("Third RegularPolygon \n\tperimeter is: " + RP3.getPerimeter() +
                "\n\tarea is: " + RP3.getArea());
    }
}
