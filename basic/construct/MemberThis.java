package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;  //이름이 다르므로 this 사용 안함
        this.nameField = nameParameter; //써도 상관없음
    }
}
