package week_05.live_class;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random()* 100);
        int guess = -1;

        while(number != guess){
            System.out.println("Make a guess");
            guess = input.nextInt();

            if (number < guess)
                System.out.println("Your guess is too high!");
            else if (number > guess)
                System.out.println("Your guess is too low!");
            else
                System.out.println("Yes, the number is " + number);

        }
    }
}
