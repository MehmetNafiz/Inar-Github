package week_05.assigments;

public class Question_05_05 {
    public static void main(String[] args) {
        System.out.printf("%s\t%6s\t|\t%s\t\t\t%9s\n","Kilograms", "Pounds", "Pounds", "Kilograms");
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d\t\t\t%6.1f\t|\t%d\t\t\t\t%9.2f\n",
                    i * 2 + 1, (i * 2 + 1) * 2.2, i * 5 + 20, (i * 5 + 20) / 2.2);


        }
    }
}
