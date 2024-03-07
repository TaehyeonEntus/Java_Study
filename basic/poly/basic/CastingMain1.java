package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        //단 자식의 기능 호출 불가

        //다운 캐스팅
        Child child = (Child) poly;
        child.childMethod();

    }
}
