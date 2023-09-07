package week_05.assigments;

public class Question_05_06 {
    public static void main(String[] args) {
        System.out.printf("%s\t\t%-6s\t|\t%s\t\t%-9s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d\t\t\t%-6.3f\t\t|\t%d\t\t\t\t%-9.3f\n",
                    i * 2 + 1, (i * 2 + 1) * 1.609, i * 5 + 20, (i * 5 + 20) / 1.609);
        }
    }
}
