package week_09.assignments.Question_09_04;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random1 = new Random(1000);

        System.out.println("Random Numbers are");
        for (int i = 0; i < 50; i++) {
            if(i % 10 == 0)
                System.out.println();
            System.out.printf("%3d", random1.nextInt(100));
        }
    }
}
