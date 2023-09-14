package week_05.assigments;

public class Question_05_25 {
    public static void main(String[] args) {
        double phrantyze = 0;
        double total = 0;
        for (int i = 10000; i <= 100000 ; i += 10000) {

            phrantyze = 0;
            for (int j = 1; j <= i; j++) {
                phrantyze += Math.pow(-1, j+1) / (2 * j -1);
            }
            total = 4 * phrantyze;
            System.out.println("PI value for i = " + i + ":  " + total);
        }
    }
}
