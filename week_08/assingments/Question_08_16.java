package week_08.assingments;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] array = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1}};
        System.out.println("Original Array:");
        displayArray(array);

        sortDimensionalArray(array);

        System.out.println("Sorted Array:");
        displayArray(array);
    }

    private static void sortDimensionalArray(int[][] array) {
        sortFirstDimension(array);
        sortSecondDimension(array);
    }

    private static void sortFirstDimension(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int  j = i + 1; j < array.length; j++) {
                if(array[i][0] > array[j][0]) {
                    int temp = array[i][0];
                    array[i][0] = array[j][0];
                    array[j][0] = temp;

                    temp = array[i][1];
                    array[i][1] = array[j][1];
                    array[j][1] = temp;
                }
            }
        }
    }

    private static void sortSecondDimension(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i][0] == array[j][0] && array[i][1] > array[j][1]){
                    int temp = array[i][0];
                    array[i][0] = array[j][0];
                    array[j][0] = temp;

                    temp = array[i][1];
                    array[i][1] = array[j][1];
                    array[j][1] = temp;
                }
            }
        }
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
