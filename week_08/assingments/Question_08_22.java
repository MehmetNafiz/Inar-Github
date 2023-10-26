package week_08.assingments;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        fillMatrix(matrix);
        displayMatrix(matrix);
        analyzeMatrix(matrix);
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void analyzeMatrix(int[][] matrix) {
        analyzeRowsOfMatrix(matrix);
        analyzeColumnsOfMatrix(matrix);
    }

    private static void analyzeRowsOfMatrix(int[][] matrix) {
        boolean isAllEven = true;

        for (int i = 0; i < matrix.length; i++) {
            int numberOfOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1)
                    numberOfOnes++;
            }
            if (numberOfOnes % 2 != 0)
                isAllEven = false;
        }
        if (isAllEven)
            System.out.println("Every row have an even number of 1s");
        else
            System.out.println("Every row does not have an even number of 1s");
    }

    private static void analyzeColumnsOfMatrix(int[][] matrix) {
        boolean isAllEven = true;

        for (int i = 0; i < matrix.length; i++) {
            int numberOfOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[j][i] == 1)
                    numberOfOnes++;
            }
            if (numberOfOnes % 2 != 0)
                isAllEven = false;
        }
        if (isAllEven)
            System.out.println("Every column have an even number of 1s");
        else
            System.out.println("Every column does not have an even number of 1s");
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }
}
