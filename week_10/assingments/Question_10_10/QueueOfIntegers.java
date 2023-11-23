package week_10.assingments.Question_10_10;

public class QueueOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public QueueOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public QueueOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            System.out.println("Lenght Of Queue is increaed");
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;

        } else {
            elements[size++] = value;
            System.out.println(value + " enqueued to queue");
        }
    }

    public int dequeue() {
        int returnedValue = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != 0) {
                returnedValue = elements[i];
                elements[i] = 0;
                break;
            }
        }

        if (returnedValue == 0) {
            System.out.println("The queue is empty");
            return 0;
        } else {
            System.out.println(returnedValue + " dequeued form queue");
            dropZeros();
            return returnedValue;
        }
    }

    public void dropZeros() {
        System.out.println("Dropping Zeros");
        int indexOfLastZero = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0)
                indexOfLastZero++;
            else
                break;
        }
        System.arraycopy(elements, 1, elements, 0, elements.length - 1);
        size--;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < elements.length; i++) {
            output += elements[i] + "  ";
        }
        return output;
    }
}
