package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        //Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();//생성자 선택, 인스턴스 생성
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
