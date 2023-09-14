package week_05.assigments;

public class Question_05_19 {
    public static void main(String[] args) {
        int spaces = 8;
        int number = 0;

        for (int i = 0; i < 8; i++) {
            number = 0;
            for (int j = 0; j < (8 - i); j++) {
                System.out.print("     ");
            }
            while (number <= i) {
                System.out.print((int)Math.pow(2, number));
                if ((int)Math.pow(2, number + 1) < 10)
                    System.out.print("    ");
                else if ((int)Math.pow(2, number + 1) < 100)
                    System.out.print("   ");
                else
                    System.out.print("  ");

                number++;
            }
            number -= 2;

            while (number >= 0) {
                System.out.print((int)Math.pow(2, number));
                if ((int)Math.pow(2, number - 1) < 10)
                    System.out.print("    ");
                else if ((int)Math.pow(2, number - 1) < 100)
                    System.out.print("   ");
                else
                    System.out.print("  ");
                number--;

            }
            System.out.println("");
        }
    }
}
