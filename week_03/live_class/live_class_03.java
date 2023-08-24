package week_03.live_class;

import java.util.Scanner;

public class live_class_03 {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);


        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int result = input.nextInt();

        if (result == (number1 + number2))
            System.out.println("Result is true");
        else {
            System.out.println("Result is false");
        }
    }
}
