package week_07.assignments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list;
        boolean isConsecutiveFour;

        System.out.println("Enter the number of values:");
        int numberOfValues = input.nextInt();

        System.out.println("Enter the values:");
        list = fillList(numberOfValues);

        isConsecutiveFour = isConsecutiveFour(list);

        displayOutput(isConsecutiveFour);

    }

    private static boolean isConsecutiveFour(int[] list) {

        for (int i = 0; i < list.length - 3; i++) {
            boolean isConsecutiveFour = true;
            for (int j = i + 1; j < i + 4; j++) {
                if(list[i] != list[j])
                    isConsecutiveFour = false;
            }
            if (isConsecutiveFour == true)
                return true;
        }
        return false;
    }

    private static void displayOutput(boolean isConsecutiveFour) {
        if(isConsecutiveFour)
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }

    public static int[] fillList(int length) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}