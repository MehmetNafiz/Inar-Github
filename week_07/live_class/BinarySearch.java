package week_07.live_class;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {11,12,13,14,15,16};

        int indexOfFisrtArray = binarySearch(array1,3);
        int indexOfFisrtArray1 = binarySearch(array1,11);
        int indexOfFisrtArray2 = binarySearch(array1,8);

    }

    private static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;

            if (key < array[mid]) {
                high = mid - 1;
            }
            else if (key == array[mid] ) {
                return mid;
            }
            else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
