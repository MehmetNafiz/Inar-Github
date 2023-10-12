package week_07.assignments;

import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {
        int[] list1;
        int[] list2;
        boolean isEquals;
        System.out.println("Enter list1 (6 integers):");
        list1 = fillList();
        System.out.println("Enter list2 (6 integers):");
        list2 = fillList();

        isEquals = equals(list1, list2);

        if(isEquals)
            System.out.println("Two lists are strictly identical");
        else
            System.out.println("Two lists are not strictly identical");
    }

    private static int[] fillList() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[6];
        for (int i = 0; i < list.length; i++) {
           list[i] = input.nextInt();
        }
        return list;
    }

    private static boolean equals(int[] list1, int[] list2) {
        boolean isEqual = true;

        for (int i = 0; i < 6; i++) {
            if(list1[i] != list2[i])
                isEqual = false;
        }
        return isEqual;
    }
}
