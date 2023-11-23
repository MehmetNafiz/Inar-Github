package week_11.assingments.Question_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        fillArrray(list1);
        Integer max = max(list1);

        System.out.println("The largest number in the list " + max);
    }

    private static void fillArrray(ArrayList<Integer> list1) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers ending wtih 0:");

        int number = input.nextInt();

        while(number != 0){
            list1.add(number);
            number = input.nextInt();
        }
    }

    private static Integer max(ArrayList<Integer> list1) {
        if(list1.isEmpty())
            return null;

        int max = list1.get(0);

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) > max)
                max = list1.get(i);
        }

        return max;

    }
}
