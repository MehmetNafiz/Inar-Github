package week_05.assigments;

public class Question_05_18 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i < 7; i++) {
            while (number <= i) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println("");
            number = 1;
        }

        System.out.println("*****************");

        for (int i = 6; i > 0; i--) {
            while (number <= i) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println("");
            number = 1;

        }

        System.out.println("*****************");

        for (int i = 1; i < 7; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            while (number >= 1) {
                System.out.print(number + " ");
                number--;
            }
            number = i + 1;
            System.out.println("");
        }

        System.out.println("*****************");

        number = 1;
        for (int i = 6; i > 0; i--) {
            while(number <= i){
                System.out.print( number + " ");
                number++;
            }
            System.out.println();
            for (int j = 6; j >= i; j--) {
                System.out.print("  ");
            }
            number = 1;
        }

    }

}
