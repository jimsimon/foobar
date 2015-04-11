import com.google.challenges.SquareSupplies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareSuppliesTest {

    @Test
    public void test1() {
        int result = SquareSupplies.answer(24);
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        int result = SquareSupplies.answer(160);
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int result = SquareSupplies.answer(10000);
        assertEquals(1, result);
    }

}
