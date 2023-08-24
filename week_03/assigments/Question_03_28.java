package week_03.assigments;
import java.util.Scanner;
public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter r1's center x,y coordinates, width, and height:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.println("Enter r2's center x,y coordinates, width, and height:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        boolean isInside = ((x1+h1/2)>=(x2+h2/2)) && ((x1-h1/2)<=(x2-h2/2))
                && ((y1+w1/2)>=(y2+w2/2)) && ((y1-w1/2)<=(y2-w2/2));

        if (isInside)
            System.out.println("r2 is inside r1");
        else
            System.out.println("r2 overlaps r1");


    }
}
