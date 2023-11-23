package week_11.assingments.Question_11_10;

public class ArrayListStackTest {
    public static void main(String[] args) {
        ArrayListStack list1 = new ArrayListStack();

        list1.push("Ahmet");
        list1.push("Ayşe");
        list1.push("Kazım");
        list1.push("Ömer");
        list1.push("Necmettin");

        System.out.println(list1);

        System.out.println("List after peek");
        list1.peek();
        System.out.println(list1);

        System.out.println("List after pop");
        list1.pop();
        System.out.println(list1);
    }

}
