package week_08.assingments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}
        };

        computeAndDisplayClosestPoints(points);
    }

    private static void computeAndDisplayClosestPoints(double[][] points) {
        int indexOfClosestPoint1 = 0;
        int indexOfClosestPoint2 = 1;
        double distanceBetweenPoints = 0;
        double closestDistanceBetweenPoints = 10;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                distanceBetweenPoints = Math.sqrt(
                        Math.pow(points[i][0] - points[j][0], 2) +
                        Math.pow(points[i][1] - points[j][1], 2) +
                        Math.pow(points[i][2] - points[j][2], 2)
                );
                if(distanceBetweenPoints < closestDistanceBetweenPoints){
                    closestDistanceBetweenPoints = distanceBetweenPoints;
                    indexOfClosestPoint1 = i;
                    indexOfClosestPoint2 = j;
                }
            }
        }

        System.out.println("The closest two points are " +
                "(" + points[indexOfClosestPoint1][0] + "," + points[indexOfClosestPoint1][1] + "," + points[indexOfClosestPoint1][2] +") and (" +
                points[indexOfClosestPoint2][0] + "," + points[indexOfClosestPoint2][1] + "," + points[indexOfClosestPoint2][2] + ")");
    }
}
