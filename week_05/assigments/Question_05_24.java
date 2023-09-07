package week_05.assigments;

public class Question_05_24 {
    public static void main(String[] args) {
        double total = 0;
        for (double i = 1; i <=97 ; i+=2) {
            total += i / (i+2);
        }
        System.out.println("Sum of series:" + total);
    }
}
