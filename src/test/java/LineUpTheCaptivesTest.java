import com.google.challenges.LineUpTheCaptives;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineUpTheCaptivesTest {

    @Test
    public void test1() {
        int x = 2;
        int y = 2;
        int n = 3;
        String result = LineUpTheCaptives.answer(x, y, n);
        assertEquals(result, "2");
    }

    @Test
    public void test2() {
        int x = 1;
        int y = 2;
        int n = 6;
        String result = LineUpTheCaptives.answer(x, y, n);
        assertEquals(result, "24");
    }
}
