package week_05.assigments;

public class Question_05_12 {
    public static void main(String[] args) {
        int largest = 0;
        int number = 0;
        while( Math.pow(number,2) < 12000){
            largest = --number;
        }
        System.out.println("The smallest n is " + largest);
    }
}
