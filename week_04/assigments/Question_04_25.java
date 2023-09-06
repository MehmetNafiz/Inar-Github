package week_04.assigments;

public class Question_04_25 {
    public static void main(String[] args) {

        char charFirst = (char)(int)(Math.random() * (90 - 65) + 65);
        char charSecond = (char)(int)(Math.random() * (90 - 65) + 65);
        char charThird = (char)(int)(Math.random() * (90 - 65) + 65);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int number4 = (int)(Math.random() * 10);

        System.out.println("Generated plate number:" + charFirst + charSecond + charThird +
                number1 + number2 + number3 + number4);


    }
}
