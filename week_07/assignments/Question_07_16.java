package week_07.assignments;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] numbers = new int[100_000];
        fillArray(numbers);
        sortArray(numbers);


        long startTimeOfLinear = System.currentTimeMillis();
        searchLinear(55, numbers);
        long endTimeOfLinear = System.currentTimeMillis();

        long startTimeOfBinary = System.currentTimeMillis();
        searchBinary(55, numbers);
        long endTimeOfBinary = System.currentTimeMillis();

        System.out.println("Execution time of invoking the searchLinear in milliseconds: "
                + (endTimeOfLinear - startTimeOfLinear));
        System.out.println("Execution time of invoking the searchBinary in milliseconds: "
                + (endTimeOfBinary - startTimeOfBinary));

    }

    private static void sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] > numbers[i]){
                    int tempt = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempt;
                }
            }

        }
    }

    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
            System.out.println();
        }
    }

    private static void searchLinear(int key, int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == key) {
                System.out.println("We find the number in searchLinear method");
                break;
            }
        }
    }

    private static void searchBinary(int key, int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (key < numbers[mid])
                high = mid - 1;
            else if (key == numbers[mid]) {
                System.out.println("We find the number in searchBinary method");
                break;
            }
            else
                low = mid + 1;
        }
    }
}
