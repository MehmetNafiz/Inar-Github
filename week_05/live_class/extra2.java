package week_05.live_class;

public class extra2 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <= 6; i++) {
            number = 1;
            for (int j = 0; j <= (5 - i); j++) {
                System.out.print("  ");
            }
            while (number <= i) {
                System.out.print(number + " ");
                number++;
            }
            number -= 2;

            while (number >= 1) {
                System.out.print(number + " ");
                number--;
            }
            System.out.println("");
        }

        for (int i = 0; i <= 5; i++) {
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            while (number < (6 - i)) {
                System.out.print(number + " ");
                number++;
            }

            number -=2;

            while (number > 0){
                System.out.print(number + " ");
                number--;
            }
            System.out.println("");
        }
    }
}
