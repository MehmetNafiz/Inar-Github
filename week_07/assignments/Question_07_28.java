package week_07.assignments;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers:");
        int[] numberList = fillList();

        displayCombination(numberList);
    }

    private static void displayCombination(int[] numberList) {
        for (int i = 0; i < numberList.length; i++) {
            for (int j = 0; j < numberList.length; j++) {
                System.out.println(numberList[i] + "  " + numberList[j]);
            }
        }
    }

    public static int[] fillList() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}


