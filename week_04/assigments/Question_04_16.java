package week_04.assigments;

public class Question_04_16 {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * (90-65)) + 65;

        System.out.println("Random letter is " + (char)randomNumber);
    }
}
