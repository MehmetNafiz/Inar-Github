package week_05.live_class;

import java.util.Scanner;

public class NumberAmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        String number = input.nextLine();
        double total = 0;

        for (int i = 0; i < 3; i++) {
            total += Math.pow(Integer.parseInt(number.charAt(i) + ""),3);
        }
        if (total == Integer.parseInt(number))
            System.out.println(number + " is an amstrong number");
        else
            System.out.println(number + " is not an amstrong number");
    }
}
