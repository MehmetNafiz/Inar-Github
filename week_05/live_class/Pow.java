package week_05.live_class;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 1;
        System.out.println("Enter base:");
        int base = input.nextInt();

        System.out.println("Enter pow");
        int pow = input.nextInt();

        for (int i = 1; i <=pow ; i++) {
            total *= base;
        }
        System.out.println("The result is " + total);
    }
}
