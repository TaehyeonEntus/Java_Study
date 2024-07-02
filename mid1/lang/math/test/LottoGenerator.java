package lang.math.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lotto = new ArrayList<>();
        while(lotto.size()< 6) {
            int randomInt = random.nextInt(45) + 1;
            if (!lotto.contains(randomInt))
                lotto.add(randomInt);
        }
        System.out.println("lotto = " + lotto);
    }
}
