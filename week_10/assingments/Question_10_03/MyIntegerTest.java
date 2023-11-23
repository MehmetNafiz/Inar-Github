package week_10.assingments.Question_10_03;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger myInt1 = new MyInteger(41614161);
        char[] arr = {'1','2','3'};
        String str = "123";

        System.out.println("getValue(): " + myInt1.getValue());
        System.out.println("isEven(): " + myInt1.isEven());
        System.out.println("isOdd(): " + myInt1.isOdd());
        System.out.println("isPrime(): " + myInt1.isPrime());
        System.out.println("equals(): " + myInt1.equals(10));
        System.out.println("equals(MyInteger(41614161))static: " + myInt1.equals(new MyInteger(41614161)));
        System.out.println("isEven(41614161)static: " + MyInteger.isEven(myInt1));
        System.out.println("isOdd(41614161)static: " + MyInteger.isOdd(myInt1));
        System.out.println("isPrime(41614161)static: " + MyInteger.isPrime(myInt1));
        System.out.println("parseInt(char[]{1,2,3}) static: " + MyInteger.parseInt(arr));
        System.out.println("parseInt(String 123) static: " + MyInteger.parseInt(str));


    }
}
