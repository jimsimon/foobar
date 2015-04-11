import com.google.challenges.BooleansPassword;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooleansPasswordTest {

    @Test
    public void test1() {
        int[][] input = {{10, 1, 2},{5, 1, 5}};

        int[] result = BooleansPassword.answer(input);

        assertEquals(result[0], 0);
        assertEquals(result[1], 1);

    }

    @Test
    public void test2() {
        int[][] input = {{5, 1, 5},{10, 1, 2}};

        int[] result = BooleansPassword.answer(input);

        assertEquals(result[0], 1);
        assertEquals(result[1], 0);

    }

    @Test
    public void test3() {
        int[][] input = {{390, 185, 624}, {686, 351, 947}, {276, 1023, 1024}, {199, 148, 250}};

        int[] result = BooleansPassword.answer(input);

        assertEquals(result[0], 2);
        assertEquals(result[1], 3);
        assertEquals(result[2], 0);
        assertEquals(result[3], 1);

    }
}
