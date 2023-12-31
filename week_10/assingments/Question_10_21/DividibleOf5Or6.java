package week_10.assingments.Question_10_21;

import java.math.BigInteger;

public class DividibleOf5Or6 {
    public static void main(String[] args) {
        BigInteger testNumber = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger FIVE = BigInteger.valueOf(5L);
        BigInteger SIX = BigInteger.valueOf(6L);

        int count = 0;
        while (count < 10) {
            testNumber = testNumber.add(BigInteger.ONE);

            BigInteger remainder = testNumber.remainder(FIVE);
            if (remainder.intValue() == 0) {
                System.out.print("\n" + testNumber.toString());
                System.out.print(" divided by 5 = ");
                BigInteger res = testNumber.divide(FIVE);
                System.out.print(res.toString());
                count++;
            }

            BigInteger remainder6 = testNumber.remainder(SIX);
            if (remainder6.intValue() == 0) {
                System.out.print("\n" + testNumber.toString());
                System.out.print(" divided by 6 = ");
                BigInteger res = testNumber.divide(SIX);
                System.out.print(res.toString());
                count++;
            }

        }
    }
}
