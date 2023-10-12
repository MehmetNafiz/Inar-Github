package week_07.assignments;

import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        int[] list1;
        int[] list2;
        boolean isEquals;
        System.out.println("Enter list1 (6 integers):");
        list1 = fillList();
        System.out.println("Enter list2 (6 integers):");
        list2 = fillList();

        isEquals = identicals(list1, list2);

        if(isEquals)
            System.out.println("Two lists are identical");
        else
            System.out.println("Two lists are not identical");
    }

    public static int[] fillList() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[6];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean identicals(int[] list1, int[] list2) {
        boolean isEqual = true;
        list1 = sortList(list1);
        list2 = sortList(list2);

        for (int i = 0; i < 6; i++) {
            if(list1[i] != list2[i])
                isEqual = false;
        }
        return isEqual;
    }

    public static int[] sortList(int[] list) {
        for (int i = list.length - 1; i > 0 ; i--) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (list[i] < list[j]) {
                    int tempt = list[i];
                    list[i] = list[j];
                    list[j] = tempt;
                }
            }
        }
        return list;
    }
}
