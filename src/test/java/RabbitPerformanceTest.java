import com.google.challenges.RabbitPerformance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RabbitPerformanceTest {

    @Test
    public void test1() {
        double[] list1 = {1.0};
        double[] list2 = {1.0};

        int result = RabbitPerformance.answer(list1, list2);
        assertEquals(0, result);
    }

    @Test
    public void test2() {
        double[] list1 = {2.2999999999999998, 15.0, 102.40000000000001, 3486.8000000000002};
        double[] list2 = {23.0, 150.0, 1024.0, 34868.0};

        int result = RabbitPerformance.answer(list1, list2);
        assertEquals(90, result);
    }
}
