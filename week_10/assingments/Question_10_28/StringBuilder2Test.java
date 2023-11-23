package week_10.assingments.Question_10_28;

public class StringBuilder2Test {
    public static void main(String[] args) {
        MyStringBuilder2 str1 = new MyStringBuilder2("1907");
        MyStringBuilder2 str2 = new MyStringBuilder2("Fenerbahce");
        MyStringBuilder2 str3 = str1.insert(1,str2);
        System.out.println("Insert s2 into s1 at index 2 -> " + str3);
        System.out.println("Reverse s2 -> " + str2.reverse());
        System.out.println("Substring of s3 beginning index 10 " + str2.substring(1));
        System.out.println("s2 to upper case -> " + str2.toUpperCase());
    }
}
