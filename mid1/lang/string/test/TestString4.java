package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String str1 = str.substring(0,5);
        String str2 = str.substring(5);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
