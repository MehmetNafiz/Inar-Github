package week_10.assingments.Question_10_20;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimal2 {
    public static void main(String[] args) {
        BigDecimal E = BigDecimal.valueOf(1.0);
        for (int i = 100; i <= 1000; i +=100) {
            BigDecimal numerator = BigDecimal.valueOf(1.0);
            BigDecimal denominator = new BigDecimal(factorial(i));
            BigDecimal result = numerator.divide(denominator, 25, BigDecimal.ROUND_UP);
            E = E.add(result);
            if (i % 100 == 0)
                System.out.println(E);

        }

    }

    public static BigInteger factorial(int x) {
        BigInteger temp = new BigInteger("1");
        for (int i = 1; i <= x; i++)
            temp = temp.multiply(BigInteger.valueOf(i));
        return temp;
    }
}
