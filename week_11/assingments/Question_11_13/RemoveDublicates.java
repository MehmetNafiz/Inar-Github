package week_11.assingments.Question_11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void removeDuplicate(ArrayList<Integer> list) {
        Integer temp;
        int counter = 0;

        while(counter != list.size()) {
            temp = list.get(counter);
            list.remove(counter);

            while (list.contains(temp)) {
                list.remove(temp);
            }

            list.add(counter, temp);
            counter++;
        }
    }
}
