package week_10.assingments.Question_10_16;

import java.math.BigInteger;

public class BigIntegerDividibleBy2Or3 {
    public static void main(String[] args) {
        String number = "10000000000000000000000000000000000000000000000000";
        int counter = 0;
        BigInteger bigInt1 = new BigInteger(number);


        while(counter < 10){
                if(bigInt1.mod(BigInteger.TWO) == BigInteger.ZERO || bigInt1.mod(BigInteger.TWO.add(BigInteger.ONE)) == BigInteger.ZERO) {
                    counter++;
                    System.out.println(bigInt1);
                }
                bigInt1 = bigInt1.add(BigInteger.ONE);
        }
    }
}
