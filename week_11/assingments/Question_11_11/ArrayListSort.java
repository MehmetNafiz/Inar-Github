package week_11.assingments.Question_11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a list of integers ending with 0:");
        int number = input.nextInt();

        while (number != 0){
            list.add(number);
            number = input.nextInt();
        }

        sort(list);
        System.out.println(list);
    }

    private static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
