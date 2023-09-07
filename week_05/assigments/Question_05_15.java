package week_05.assigments;

public class Question_05_15 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 33; i < 127 ; i++) {
            System.out.print((char)i + " ");
            counter++;
            if (counter == 10){
                System.out.println();
                counter = 0;
            }

        }
    }
}
