package week_08.assingments;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee number:");
        int employeeNumber = input.nextInt();

        int[][] weeklyWorkHours = new int[employeeNumber][7];
        int[][] employeeAndWorkHour = new int[employeeNumber][2];
        fillArray(weeklyWorkHours);
        computeTotalHours(weeklyWorkHours,employeeAndWorkHour);
        sortEmployees(employeeAndWorkHour);
        displayArray(employeeAndWorkHour);
    }

    public static void displayArray(int[][] studentAndCorrects) {
        System.out.println("Employees and their total hours in decreasing" +
                " order of total hours:");
        for (int i = 0; i < studentAndCorrects.length; i++) {
            System.out.println("Student " + studentAndCorrects[i][0]
                    + "'s correct count is " + studentAndCorrects[i][1]);
        }
    }

    public static void sortEmployees(int[][] employeeAndWorkHour) {
        for (int j = 0; j < employeeAndWorkHour.length; j++) {
            for (int i = 0; i < employeeAndWorkHour.length - 1; i++) {
                if (employeeAndWorkHour[i][1] < employeeAndWorkHour[i + 1][1]) {
                    int tempt = employeeAndWorkHour[i][0];
                    employeeAndWorkHour[i][0] = employeeAndWorkHour[i + 1][0];
                    employeeAndWorkHour[i + 1][0] = tempt;

                    tempt = employeeAndWorkHour[i][1];
                    employeeAndWorkHour[i][1] = employeeAndWorkHour[i + 1][1];
                    employeeAndWorkHour[i + 1][1] = tempt;
                }
            }
        }

    }

    private static void computeTotalHours(int[][] weeklyWorkHours, int[][] employeeAndWorkHour) {
        for (int i = 0; i < weeklyWorkHours.length; i++) {
            int totalHour = 0;
            for (int j = 0; j < weeklyWorkHours[i].length; j++) {
                totalHour += weeklyWorkHours[i][j];
            }
            employeeAndWorkHour[i][0] = i;
            employeeAndWorkHour[i][1] = totalHour;
        }
    }

    private static void fillArray(int[][] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter employee " + i + "'s work hours for 7 days");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
    }
}
