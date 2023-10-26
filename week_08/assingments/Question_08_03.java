package week_08.assingments;

public class Question_08_03 {
    public static void main(String[] args) {
        final char[] KEY = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] studentAndCorrects = new int[8][2];
        char[][] answerOfStudents = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };

        computeAndDisplayResult(KEY, answerOfStudents, studentAndCorrects);
        sortStudents(studentAndCorrects);
        displayArray(studentAndCorrects);
    }

    public static void sortStudents(int[][] studentAndCorrects) {

        for (int j = 0; j < studentAndCorrects.length; j++) {
            for (int i = 0; i < studentAndCorrects.length - 1; i++) {
                if (studentAndCorrects[i][1] > studentAndCorrects[i + 1][1]) {
                    int tempt = studentAndCorrects[i][0];
                    studentAndCorrects[i][0] = studentAndCorrects[i + 1][0];
                    studentAndCorrects[i + 1][0] = tempt;

                    tempt = studentAndCorrects[i][1];
                    studentAndCorrects[i][1] = studentAndCorrects[i + 1][1];
                    studentAndCorrects[i + 1][1] = tempt;
                }
            }
        }

    }

    public static void displayArray(int[][] studentAndCorrects) {
        for (int i = 0; i < studentAndCorrects.length; i++) {
            System.out.println("Student " + studentAndCorrects[i][0]
                    + "'s correct count is " + studentAndCorrects[i][1]);
        }
    }

    public static void computeAndDisplayResult(char[] key, char[][] answerOfStudents, int[][] studentAndCorrects) {

        for (int i = 0; i < answerOfStudents.length; i++) {
            int correctsOfStudent = 0;
            for (int j = 0; j < answerOfStudents[i].length; j++) {
                if (answerOfStudents[i][j] == key[j])
                    correctsOfStudent++;
            }
            studentAndCorrects[i][0] = i;
            studentAndCorrects[i][1] = correctsOfStudent;
        }

    }
}
