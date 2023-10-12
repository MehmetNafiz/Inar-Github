package week_07.live_class;

public class MaxMinIndex {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }

        int max = list[0];
        int indexOfMax = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                indexOfMax = i;
            }
        }

        int min = list[0];
        int indexOfMin = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
                indexOfMin = i;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Max value of the list is " + max + " with " + indexOfMax + ". index" );
        System.out.println("Min value of the list is " + min + " with " + indexOfMin + ". index" );

    }
}
