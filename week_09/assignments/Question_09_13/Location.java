package week_09.assignments.Question_09_13;

public class Location {
    public double maxValue = Integer.MIN_VALUE;
    public int row;
    public int column;


    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}
