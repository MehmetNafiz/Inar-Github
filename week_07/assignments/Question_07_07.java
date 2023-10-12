package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {
        int number = 0;
        int[] countsOfNumbers = new int[10];

        for (int i = 0; i < 100; i++) {
            number = (int)(Math.random() * 10);
            countsOfNumbers[number]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Number of "  + i + "'s -> " + countsOfNumbers[i]);
        }

    }
}
