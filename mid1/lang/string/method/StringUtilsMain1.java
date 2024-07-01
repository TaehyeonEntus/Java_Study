package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString);

        //문자 + x -> 문자
        String numString2 = "" + num;
        System.out.println("빈 문자열 + num: " + numString2);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray)
            System.out.print(c);
    }
}
