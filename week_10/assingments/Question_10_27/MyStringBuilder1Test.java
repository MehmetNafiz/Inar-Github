package week_10.assingments.Question_10_27;

public class MyStringBuilder1Test {
    public static void main(String[] args) {
        MyStringBuilder1 str1 = new MyStringBuilder1("La Casa De Papel--");

        System.out.println(str1.append(new MyStringBuilder1("@El Profesor")));

        System.out.println(str1);
        System.out.println(str1.append(4161));
        System.out.println(str1.length());
        System.out.println(str1.charAt(19));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(19,30));

    }
}
