package week_05.assigments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int guess = 0;
        int correctCount =  0;

        for (int i = 0; i < 10; i++) {
            number1 = (int)(Math.random()*10);
            number2 = (int)(Math.random()*10);

            System.out.println("What is " + number1 + " + " + number2 + "?");
            guess = input.nextInt();
            if (guess == number1 + number2){
                System.out.println("you are correct!\n");
                correctCount++;
            }
            else{
                System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2) + "\n");
            }
        }
        System.out.println("*******************");
        System.out.println("You have " + correctCount + " correct answer");
    }
}
