package week_07.live_class;

public class LineerSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,12,2,3523,5,12};
        int indexOfNumberTwo = linearSearch(array, 2);
        System.out.println(indexOfNumberTwo);
    }

    private static int linearSearch(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                index = i;
            }
        }
        return index;
    }
}
