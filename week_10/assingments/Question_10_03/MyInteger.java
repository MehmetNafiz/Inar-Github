package week_10.assingments.Question_10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd() {
        if (value % 2 == 1)
            return true;
        else
            return false;
    }

    public boolean isPrime() {
        boolean isPrime = true;

        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0)
                isPrime = false;
        }

        return isPrime;
    }

    public static boolean isEven(MyInteger myInt) {
        if (myInt.value % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(MyInteger myInt) {
        if (myInt.value % 2 == 1)
            return true;
        else
            return false;
    }

    public static boolean isPrime(MyInteger myInt) {
        boolean isPrime = true;

        for (int i = 2; i < myInt.value / 2; i++) {
            if (myInt.value % i == 0)
                isPrime = false;
        }

        return isPrime;
    }

    public boolean equals(int x) {
        if (this.value == x)
            return true;
        else
            return false;
    }

    public boolean equals(MyInteger myInt) {
        if (this.value == myInt.value)
            return true;
        else
            return false;
    }

    public static int parseInt(char[] arr) {

        String str = String.valueOf(arr);


        return Integer.parseInt(str);
    }

    public static int parseInt(String a) {

        return Integer.parseInt(a);

    }


}
