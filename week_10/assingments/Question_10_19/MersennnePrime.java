package week_10.assingments.Question_10_19;

import java.math.BigInteger;

public class MersennnePrime {
    public static void main(String[] args) {
        int root;
        BigInteger result;


        for (root = 2; root <= 100 ; root++) {
            long form = (long)Math.pow(2,root) - 1;
            result = BigInteger.valueOf(form);

            if(isPrime(result)){
                System.out.printf("%2d\t\t%s\n",root,result);
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
