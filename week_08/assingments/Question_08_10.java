package week_08.assingments;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        fillMatrix(matrix);
        displayMatrix(matrix);
        computeLargestRow(matrix);
        computeLargesyColumn(matrix);
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    private static void computeLargestRow(int[][] matrix) {
        int largestRowIndex = 0;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int countOfOnes = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1)
                    countOfOnes++;
            }

            if(countOfOnes > maxCount) {
                maxCount = countOfOnes;
                largestRowIndex = i;
            }
        }
        System.out.println("The largest row index: " + largestRowIndex);
    }

    private static void computeLargesyColumn(int[][] matrix) {
        int largestColumnIndex = 0;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int countOfOnes = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[j][i] == 1)
                    countOfOnes++;
            }

            if(countOfOnes > maxCount) {
                maxCount = countOfOnes;
                largestColumnIndex = i;
            }
        }
        System.out.println("The largest row index: " + largestColumnIndex);
    }
}
