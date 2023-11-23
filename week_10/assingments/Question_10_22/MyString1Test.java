package week_10.assingments.Question_10_22;

public class MyString1Test {
    public static void main(String[] args) {

        MyString1 string1 = new MyString1(new char[]{'I', 'N', 'A', 'R'});
        System.out.println(string1);

        string1 = string1.toLowerCase();
        System.out.println(string1);

        string1 = string1.substring(0,3);
        System.out.println(string1);

        System.out.println(string1.length());

        System.out.println(string1.equals(new MyString1(new char[]{'a','b','c'})));
        System.out.println(string1.equals(new MyString1(new char[]{'i','n','a','r'})));


    }
}
