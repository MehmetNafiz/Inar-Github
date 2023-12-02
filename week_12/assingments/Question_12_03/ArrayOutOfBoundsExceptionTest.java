package week_12.assingments.Question_12_03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOutOfBoundsExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[100];

        fillArray(list);

        System.out.println("Enter the index of the array");
        int index = input.nextInt();

        try{
            System.out.println("You chose: " + list[index]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of Bounds.!!");
        }
    }

    private static void fillArray(int[] list) {
        for (int i = 0; i < 100; i++) {
            list[i] = (int)(Math.random() * 100);
        }
    }
}
