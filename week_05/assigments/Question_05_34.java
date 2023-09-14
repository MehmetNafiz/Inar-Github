package week_05.assigments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scoreOfComputer = 0;
        int scoreOfUser = 0;

        while(Math.abs(scoreOfComputer - scoreOfUser) < 2) {
            int computerGuess = (int) (Math.random() * 3);

            System.out.println("scissor (0), rock (1), paper (2):");
            int userGuess = input.nextInt();

            if (computerGuess == 0 && userGuess == 1) {
                System.out.println("The computer is scissor. You are rock. You won.");
                scoreOfUser++;
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else if (computerGuess == 1 && userGuess == 2) {
                System.out.println("The computer is rock. You are paper. You won.");
                scoreOfUser++;
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else if (computerGuess == 2 && userGuess == 0) {
                System.out.println("The computer is paper. You are scissor. You won.");
                scoreOfUser++;
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else if (computerGuess == 0 && userGuess == 2) {
                System.out.println("The computer is scissor. You are paper. Computer won.");
                scoreOfComputer++;
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else if (computerGuess == 1 && userGuess == 0) {
                System.out.println("The computer is rock. You are scissor. Computer won.");
                scoreOfComputer++;
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else if (computerGuess == 2 && userGuess == 1) {
                System.out.println("The computer is paper. You are rock. Computer won.");
                scoreOfComputer++;
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else if (computerGuess == 0 && userGuess == 0) {
                System.out.println("The computer is scissor. You are scissor too. It is a draw");
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else if (computerGuess == 1 && userGuess == 1) {
                System.out.println("The computer is rock. You are rock too. It is a draw");
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            } else {
                System.out.println("The computer is paper. You are paper too. It is a draw");
                System.out.printf("Computer wins: %d \nUser wins: %d\n", scoreOfComputer, scoreOfUser);
            }
            System.out.println("");
        }
        System.out.println("****************************");

        if (scoreOfComputer > scoreOfUser)
            System.out.println("COMPUTER WON");
        else
            System.out.println("USER WON");
    }
}
