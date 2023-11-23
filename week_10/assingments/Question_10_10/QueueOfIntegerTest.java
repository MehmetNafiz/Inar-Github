package week_10.assingments.Question_10_10;

public class QueueOfIntegerTest {
    public static void main(String[] args) {
        QueueOfIntegers queue1 = new QueueOfIntegers(5);

        queue1.enqueue(1);
        System.out.println(queue1);
        queue1.enqueue(2);
        System.out.println(queue1);
        queue1.enqueue(3);
        System.out.println(queue1);
        queue1.dequeue();
        System.out.println(queue1);
        queue1.dequeue();
        System.out.println(queue1);
        queue1.enqueue(4);
        System.out.println(queue1);
        queue1.enqueue(5);
        System.out.println(queue1);
        queue1.enqueue(6);
        System.out.println(queue1);
        queue1.enqueue(7);
        System.out.println(queue1);
        queue1.enqueue(8);
        System.out.println(queue1);
    }
}
