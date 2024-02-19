package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 불가능
        //data.privateField = 3;
        //data.privateMethod();
    }
}
