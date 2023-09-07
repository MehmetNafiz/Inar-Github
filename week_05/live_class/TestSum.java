package week_05.live_class;

public class TestSum {
    public static void main(String[] args) {
        float sum = 0;

        for (float i = 0.01f; i <1.0 ; i+=0.01f) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

    }
}
