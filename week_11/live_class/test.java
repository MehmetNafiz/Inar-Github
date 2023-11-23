package week_11.live_class;

public class test {
    public static void main(String[] args) {
        divideZero(3,0);

        try{
            divideZero2(3,0);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }


    }

    public static void divideZero(int x, int y) {
        int result = 0;

        try {
            result = x / y;
        } catch (ArithmeticException ex) {
            System.out.println("Divier is zero");
        }
        System.out.println("divideZero :" + result);
    }

    public static void divideZero2(int x, int y) throws ArithmeticException {
        if(y == 0)
            throw new ArithmeticException("Error");
        int result = x / y;
        System.out.println("divideZero2 :" + result);
    }
}
