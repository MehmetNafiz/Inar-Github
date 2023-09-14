package week_05.assigments;

public class Question_05_40 {
    public static void main(String[] args) {
        System.out.println("Flipping a coin one million times...");
         int heads = 0;
         int tails = 0;

        for (int i = 0; i < 1_000_000; i++) {
            if((int)(Math.random() * 2) == 0)
                heads++;
            else
                tails++;
        }

        System.out.printf("Heads: %d \nTails: %d", heads, tails );
    }
}
