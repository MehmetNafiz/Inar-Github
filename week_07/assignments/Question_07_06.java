package week_07.assignments;

public class Question_07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME_NUMBERS = 50;
        int counter = 0;
        int number = 2;
        int[] listOfPrime = new int[50];

        while (counter != NUMBER_OF_PRIME_NUMBERS) {
            if (isPrime(number)) {
                listOfPrime[counter] = number;
                counter++;
            }
            number++;
        }
        displayList(listOfPrime);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                isPrime = false;
        }
        return isPrime;
    }

    public static void displayList(int[] list) {
        int counter = 0;

        for (int i = 0; i < list.length; i++) {
            System.out.printf("%6d",list[i]);
            counter++;
            if (counter % 10 == 0)
                System.out.println();
        }
    }
}
