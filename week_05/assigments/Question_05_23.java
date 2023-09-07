package week_05.assigments;

public class Question_05_23 {
    public static void main(String[] args) {
        double leftToRight = 0;
        double rightToLeft = 0;

        System.out.print("Summation of series left to right: ");
        for (int i = 1; i <= 50000 ; i++) {
            leftToRight += (1.0 / i);
        }
        System.out.println(leftToRight);

        System.out.print("Summation of series right to left: ");
        for (int i = 50000; i >= 1 ; i--) {
            rightToLeft += (1.0 / i);
        }
        System.out.println(rightToLeft);


        System.out.println("Summation of series left to right - Summation of series right to left:  "
        + (leftToRight - rightToLeft));




    }
}
