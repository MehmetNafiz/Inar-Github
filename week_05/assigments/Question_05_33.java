package week_05.assigments;

public class Question_05_33 {
    public static void main(String[] args) {

        System.out.println("Perfect numbers are:");

        for (int i = 2; i <=10000 ; i++) {
            int sumOfDenominator = 0;
            int number = i;
            for (int j = 1; j <= i / 2; j++) {
                if (number % j == 0) {
                    sumOfDenominator += j;
                }
            }
            if (sumOfDenominator == i) {
                System.out.println(i);
            }

        }
    }
}
