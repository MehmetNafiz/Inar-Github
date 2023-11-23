package week_11.assingments.Question_11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter 5 integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.print("Enter 5 integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }


        System.out.println("The combined list is " + union(list1, list2).toString());
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }
}
