package week_05.assigments;


public class Question_05_20 {
    public static void main(String[] args) {
        System.out.println("The prime numbers between 2 and 1,000 inclusive are");

        int counter = 0;
        int number = 2;
        boolean isPrime;
        while (number < 1000){
            isPrime = true;
            for (int i = 2; i <= number/2 ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                counter++;
                System.out.print(number + " ");
                if (counter % 8 == 0)
                    System.out.println("");
            }
            number++;
        }

    }
}
