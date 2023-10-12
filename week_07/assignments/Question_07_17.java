package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] listOfStudents = new String[numberOfStudents];
        int[] gradesOfStudents = new int[numberOfStudents];

        fillLists(listOfStudents, gradesOfStudents);
        sortLists(listOfStudents, gradesOfStudents);

        displayList(listOfStudents);

    }

    private static void fillLists(String[] listOfStudents, int[] gradesOfStudents) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < listOfStudents.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            listOfStudents[i] = input.next();
            System.out.println("Score:");
            gradesOfStudents[i] = input.nextInt();
        }
    }

    private static void sortLists(String[] listOfStudents, int[] gradesOfStudents) {
        for (int i = 0; i < gradesOfStudents.length - 1; i++) {
            for (int j = i + 1; j < gradesOfStudents.length; j++) {
                if(gradesOfStudents[j] > gradesOfStudents[i]){
                    int temptInt = gradesOfStudents[j];
                    gradesOfStudents[j] = gradesOfStudents[i];
                    gradesOfStudents[i] = temptInt;

                    String temptString = listOfStudents[j];
                    listOfStudents[j] = listOfStudents[i];
                    listOfStudents[i] = temptString;
                }
            }
        }

    }

    public static void displayList(String[] list){
        System.out.println("The students from more successfull to less");
        for (String name : list) {
            System.out.println(name);
        }
    }
}
