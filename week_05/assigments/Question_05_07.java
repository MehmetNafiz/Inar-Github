package week_05.assigments;

public class Question_05_07 {
    public static void main(String[] args) {
        double tuition = 10000.0;
        double totalCost = 0.0;

        for (int i = 0; i < 14; i++) {
            tuition *= 1.05;

            if(i == 9)
                System.out.printf("%s %.0f\n","Tuition in ten years: ", tuition);
            if(i > 9){
                totalCost += tuition;
            }
        }
        System.out.printf("%s %.0f","Total cost four years' worth of tuition after the tenth year: ", totalCost);
    }
}
