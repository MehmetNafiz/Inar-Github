package week_03.assigments;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please guess 1 for Head and 2 for Tail");
        int guess = input.nextInt();

        int flip = (int)((Math.random()+0.5)/1);

        if(guess == flip)
            System.out.println("Your guess is right");
        else
            System.out.println("Your guess is wrong");
    }
}
