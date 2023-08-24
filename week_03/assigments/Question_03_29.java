package week_03.assigments;
import java.util.Scanner;
public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1's center x,y coordinates, and radius:");
        double xOfCircle1 = input.nextDouble();
        double yOfCircle1 = input.nextDouble();
        double radiusOfCircle1 = input.nextDouble();

        System.out.println("Enter circle2's center x,y coordinates, and radius:");
        double xOfCircle2 = input.nextDouble();
        double yOfCircle2 = input.nextDouble();
        double radiusOfCircle2 = input.nextDouble();

        double distanceBetweenCenters = Math.pow(Math.pow(xOfCircle2-xOfCircle1,2)+Math.pow(yOfCircle2-yOfCircle1,2),0.5);

        if (distanceBetweenCenters <= Math.abs(radiusOfCircle2-radiusOfCircle1))
            System.out.println("circle2 is inside circle1");
        else if (distanceBetweenCenters <= radiusOfCircle1 + radiusOfCircle2)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");




    }
}
