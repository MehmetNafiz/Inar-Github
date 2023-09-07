package week_05.assigments;

public class Question_05_04 {
    public static void main(String[] args) {
        System.out.println("Miles\t\t\t\tKilometers");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%-10d\t\t\t%-6.3f\n", i, (i * 1.609));
        }
    }
}
