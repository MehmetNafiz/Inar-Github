package week_10.assingments.Question_10_17;

import java.math.BigInteger;

public class LongMaxValue {
    public static void main(String[] args) {
        BigInteger root = BigInteger.valueOf((long) Math.sqrt(Long.MAX_VALUE));

        for (int i = 0; i < 10; i++) {
            root = root.add(BigInteger.ONE);
            System.out.println(root.pow(2));
        }
    }
}
