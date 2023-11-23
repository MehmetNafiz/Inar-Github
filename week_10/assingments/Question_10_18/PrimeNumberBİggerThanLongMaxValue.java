package week_10.assingments.Question_10_18;

import java.math.BigInteger;

public class PrimeNumberBİggerThanLongMaxValue {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        final int NUMBER_OF_PRIMES = 5;

        System.out.println();
        while (count < NUMBER_OF_PRIMES) {
            number = number.add(BigInteger.ONE);
            if (isPrime(number)){
                count++;
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(BigInteger number) {
        for (BigInteger d = new BigInteger("2");
             d.compareTo(number.divide(new BigInteger("2"))) <= 0;
             d = d.add(new BigInteger("1"))) {
            if (number.remainder(d).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }
}
