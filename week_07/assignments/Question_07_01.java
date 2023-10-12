package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxGrade = 0;

        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        int[] gradesOfStudents = new int[numberOfStudents];


        System.out.println("Enter " + numberOfStudents + " scores:");
        for (int i = 0; i < gradesOfStudents.length; i++) {
            int score = input.nextInt();
            gradesOfStudents[i] = score;
        }

        maxGrade = concludeMaxGrade(gradesOfStudents);
        printGrades(gradesOfStudents, maxGrade);
    }

    private static void printGrades(int[] gradesOfStudents, int maxGrade) {
        String grade = "";
        for (int i = 0; i < gradesOfStudents.length; i++) {
            grade = concludeGrade(gradesOfStudents[i], maxGrade);
            System.out.println("Student " + i + " score is " + gradesOfStudents[i] + " and grade is " + grade);
        }
    }

    private static String concludeGrade(int gradesOfStudent, int maxGrade) {
        if (gradesOfStudent >= maxGrade - 10)
            return "A";
        else if (gradesOfStudent >= maxGrade - 20)
            return "B";
        else if (gradesOfStudent >= maxGrade - 30)
            return "C";
        else if (gradesOfStudent >= maxGrade - 40)
            return "D";
        else
            return "F";
    }

    private static int concludeMaxGrade(int[] gradesOfStudents) {
        int max = 0;
        for (int i = 0; i < gradesOfStudents.length; i++) {
            if(gradesOfStudents[i] > max)
                max = gradesOfStudents[i];
        }
        return max;
    }
}
