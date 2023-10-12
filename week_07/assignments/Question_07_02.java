package week_07.assignments;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten integers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] reversedArray = reverseArray(numbers);
        printArray(reversedArray);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] reverseArray(int[] numbers) {
        int[] reversedArray = new int[10];
        for (int i = 0; i < numbers.length ; i++) {
            reversedArray[i] = numbers[9 - i];
        }
        return reversedArray;
    }
}
