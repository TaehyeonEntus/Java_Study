package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();   //Object로부터 묵시적 상속
        System.out.println(string);
    }
}
