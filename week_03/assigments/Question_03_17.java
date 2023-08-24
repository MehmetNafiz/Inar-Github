package week_03.assigments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Make your guess -> Scissor (0), Rock(1), Paper(2)");
        int playerGuess = input.nextInt();

        int computerGuess =(int)(Math.random() * 3);

        if (computerGuess == 0 && playerGuess == 0)
            System.out.println("The computer is scissor. You are scissor too. ıt is a draw");
        else if (computerGuess == 1 && playerGuess == 1)
            System.out.println("The computer is rock. You are rock too. ıt is a draw");
        else if (computerGuess == 2 && playerGuess == 2)
            System.out.println("The computer is paper. You are paper too. ıt is a draw");
        else if (computerGuess == 0 && playerGuess == 1)
            System.out.println("The computer is scissor. You are rock. You won");
        else if (computerGuess == 0 && playerGuess == 2)
            System.out.println("The computer is scissor. You are paper. Computer won");
        else if (computerGuess == 1 && playerGuess == 0)
            System.out.println("The computer is rock. You are scissor. Computer won");
        else if (computerGuess == 1 && playerGuess == 2)
            System.out.println("The computer is rock. You are paper. You won");
        else if (computerGuess == 2 && playerGuess == 0)
            System.out.println("The computer is paper. You are scissor. You won");
        else if (computerGuess == 2 && playerGuess == 1)
            System.out.println("The computer is paper. You are rock. You won");

    }
}
