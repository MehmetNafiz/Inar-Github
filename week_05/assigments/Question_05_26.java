package week_05.assigments;

public class Question_05_26 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000 ; i += 10000) {
            double numberE = 0;
            double denominator = 1;
            int loopNumber = i;
            while (loopNumber > 0) {
                denominator = 1;
                for (int j = 1; j <= loopNumber; j++) {
                    denominator *= j;
                }
                numberE += 1 / denominator;
                loopNumber--;
            }
            numberE++;
            System.out.println("e at i =" + i + " is " + numberE);
        }
    }
}
