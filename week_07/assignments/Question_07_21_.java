package week_07.assignments;

import java.util.Scanner;

public class Question_07_21_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of balls to drop:");
        int numberOfBalls = input.nextInt();

        System.out.println("Enter the number of slots in the bean machine:");
        int numberOfSlots = input.nextInt();

        int[] droppedBalls = new int[numberOfSlots];


        for (int i = 0; i < numberOfBalls; i++) {
            char[] ballPath;
            ballPath = drop(numberOfSlots);
            computeSlot(ballPath, droppedBalls);
        }
        displayResult(droppedBalls, numberOfSlots);

    }

    private static void displayResult(int[] droppedBalls, int numberOfSlots) {
        for (int i = numberOfSlots; i >= 1; i--) {
            for (int j = 0; j <= numberOfSlots; j++) {
                if (droppedBalls[i] >= i)
                    System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static char[] drop(int numberOfSlots) {
        char[] path = new char[numberOfSlots];
        for (int i = 0; i < numberOfSlots; i++) {
            path[i] =((int)(Math.random() * 2) % 2 == 0) ? 'R' : 'L';
        }
        return path;
    }

    private static void computeSlot(char[] ballPath, int[] droppedBalls) {
        int slot = 0;
        for (int i = 0; i < ballPath.length; i++) {
            System.out.print(ballPath[i]);
            if(ballPath[i] == 'R')
                slot++;
        }
        droppedBalls[slot]++;
        System.out.println();

    }
}
