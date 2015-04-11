import com.google.challenges.RabbitMaximumEquality;
import org.junit.Test;

import static com.google.challenges.RabbitMaximumEquality.*;
import static org.junit.Assert.assertEquals;

public class RabbitMaximumEqualityTest {

    @Test
    public void test1() {
        int[] x = {1,4,1};
        int result = answer(x);
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        int[] x = {1,2};
        int result = answer(x);
        assertEquals(1, result);
    }

    @Test
    public void onlyEmptyCars() {
        int[] x = {0,0};
        int result = answer(x);
        assertEquals(2, result);
    }

    @Test
    public void onlyFullCars() {
        int[] x = {MAX_RABBITS_PER_CAR, MAX_RABBITS_PER_CAR};
        int result = answer(x);
        assertEquals(2, result);
    }

    @Test
    public void totalRabbitsEvenlyDivisibleByCarCount() {
        int[] x = {2, 4};
        int result = answer(x);
        assertEquals(2, result);
    }

    @Test
    public void totalRabbitsNotEvenlyDivisibleByCarCount_AllRemainingFitInOneCar() {
        int[] x = {MAX_RABBITS_PER_CAR, MAX_RABBITS_PER_CAR, 5};
        int result = answer(x);
        assertEquals(2, result);
    }

    @Test
    public void totalRabbitsNotEvenlyDivisibleByCarCount_NotAllRemainingFitInOneCar() {
        int[] x = {MAX_RABBITS_PER_CAR, MAX_RABBITS_PER_CAR, MAX_RABBITS_PER_CAR-2};
        int result = answer(x);
        assertEquals(2, result);
    }


//    @Test
//    public void test_noRabbits() {
//        int[] x = {0,0};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_lessRabbitsThanCars() {
//        int[] x = {0,1};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void test_sameNumberOfRabbitsAsCars_allRabbitsInOneCar() {
//        int[] x = {0,2};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_sameNumberOfRabbitsAsCars_allRabbitsEvenlyDistributed() {
//        int[] x = {1,1};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_oneMoreRabbitThanCars() {
//        int[] x = {1,2};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void test_twiceAsManyRabbitsAsCars() {
//        int[] x = {2,2};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_moreThanTwiceAsManyRabbitsAsCars() {
//        int[] x = {3,5};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_maxCarsAndRabbits() {
//        int[] x = new int[100];
//        for (int i=0; i<x.length; i++) {
//            x[i] = 1000000;
//        }
//
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(100, result);
//    }
//
//    @Test
//    public void test_maxCarsNoRabbits() {
//        int[] x = new int[100];
//        for (int i=0; i<x.length; i++) {
//            x[i] = 0;
//        }
//
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(100, result);
//    }
//
//    @Test
//    public void test_minCarsNoRabbits() {
//        int[] x = new int[2];
//        for (int i=0; i<x.length; i++) {
//            x[i] = 0;
//        }
//
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_minCarsMaxRabbits() {
//        int[] x = new int[2];
//        for (int i=0; i<x.length; i++) {
//            x[i] = 1000000;
//        }
//
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_hm() {
//        int[] x = {1,1,1};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(3, result);
//    }
//
//    @Test
//    public void test_hmm() {
//        int[] x = {1,1,2};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_hmmm() {
//        int[] x = {1,2,2};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_hmmmm() {
//        int[] x = {2,2,2};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(3, result);
//    }
//
//    @Test
//    public void test_hmmmmm() {
//        int[] x = {1,2,1};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_hmmmmmm() {
//        int[] x = {0,0,0};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(3, result);
//    }
//
//    @Test
//    public void test_hmmmmmmm() {
//        int[] x = {0,0,1};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_hmmmmmmmm() {
//        int[] x = {0,1,0};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_hmmmmmmmmm() {
//        int[] x = {0,1,1};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void testing() {
//        int[] x = {1,2,3,4,5};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(5, result);
//    }
//
//    @Test
//    public void testing2() {
//        int[] x = {1,2,3,1,1};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(4, result);
//    }
//
//    @Test
//    public void testing3() {
//        int[] x = {1,0,0,0,0};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(4, result);
//    }
//
//    @Test
//    public void testing4() {
//        int[] x = {1,2,0,0,0};
//        int result = RabbitMaximumEquality.answer(x);
//        assertEquals(4, result);
//    }
}
