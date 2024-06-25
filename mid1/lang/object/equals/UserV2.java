package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {   //동등성 비교로 overRiding
        UserV2 user = (UserV2)obj;          //비교를 위한 다운 캐스팅
        return id.equals(user.id);
    }
}
