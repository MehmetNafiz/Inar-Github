package week_08.assingments;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2}, 
                {3, 4}, 
                {5, 6}, 
                {7, 8}, 
                {9, 10}
        };

        System.out.println("Original Array:");
        displayArray(array);
        
        shuffle(array);

        System.out.println("Shuffled Array:");
        displayArray(array);
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    private static void shuffle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * array.length);

            int temp = array[i][0];
            array[i][0] = array[randomNumber][0];
            array[randomNumber][0] = temp;

            temp = array[i][1];
            array[i][1] = array[randomNumber][1];
            array[randomNumber][1] = temp;
        }
    }
}
