package week_07.assignments;

import java.util.Scanner;

public class Question_07_32_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list;

        System.out.println("Enter list:");
        int firstNumberOfList = input.nextInt();
        list = fillList(firstNumberOfList);
    }

    public static int[] fillList(int firstNumber) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[firstNumber];

        list[0] = firstNumber;
        for (int i = 1; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}
