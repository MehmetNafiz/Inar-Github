package week_05.assigments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        int highestScore = 0;
        int secondHighestScore = 0;
        String succesfullStudent = "";
        String secondSuccesfullStudent = "";

        int score = 0;
        String name = "";

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student: " + (i+1));
            System.out.println("Name:");
            name = input.next();
            System.out.println("Score:");
            score = input.nextInt();

            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondSuccesfullStudent = succesfullStudent;
                highestScore = score;
                succesfullStudent = name;
            }
            else if(score > secondHighestScore){
                secondHighestScore = score;
                secondSuccesfullStudent = name;
            }
            System.out.println("");
        }
        System.out.println("*******************");
        System.out.println("Student with the highest score:" + succesfullStudent);
        System.out.println("The second higest scoring student:" + secondSuccesfullStudent);
    }
}
