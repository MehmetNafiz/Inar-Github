package week_12.assingments.Question_12_10;

public class OutOfMemory {
    public static void main(String[] args) {
        try {
            long[] testHeap = new long[50];
            for (int loop = 0; ; loop++) {
                testHeap = new long[testHeap.length * 4]; //Indefinitely increase array size inside of loop
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error: " + e);
        }

    }
}
