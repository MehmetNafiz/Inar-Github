package week_10.assingments.Question_10_06;

import week_10.assingments.Question_10_05.StackOfIntegers;

public class PrimeNumberLessThan120 {
    public static void main(String[] args) {
        StackOfIntegers stack1 =new StackOfIntegers(100);

        System.out.println("Prime Numbers less than 120: ");

        for (int i = 2; i < 120; i++) {
            if(isPrime(i))
                stack1.push(i);
        }

        while(stack1.getSize() >= 1){
            System.out.print(stack1.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                isPrime = false;
        }
        return isPrime;
    }
}
