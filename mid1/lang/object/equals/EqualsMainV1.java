package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));          //false
        System.out.println("equality = " + (user1.equals(user2)));  //false
        //why??
        //Object의 equals()는 ==와 같음
        //값은 같지만 다른 인스턴스임
        //기본적으로 동일성 비교
    }
}
