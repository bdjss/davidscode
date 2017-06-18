package ord.david.code.org.david.code.random;

import java.util.Random;

/**
 * Created by david on 2017/6/18.
 */
public class RandomDeom {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(10);
            System.out.println(r);
        }

    }

}
