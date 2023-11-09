package week_09.assignments.Question_09_06;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch sw1 = new StopWatch();
        
        int[] array = new int[100_000];

        for (int i = 0; i < args.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        
        sw1.start();
        sort(array);
        sw1.stop();

        System.out.println("The execution time of sorting 100,000 numbers using selection sort: " +
                +  sw1.getElapsedTime() + " milliseconds");
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            
        }
    }
}
