import com.google.challenges.MinionsBoredGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinionsBoredGameTest {

    @Test
    public void notEnoughRolls() {
        int t = 1;
        int n = 3;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(0, result);
    }

    @Test
    public void googleTest1() {
        int t = 1;
        int n = 2;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(1, result);
    }

    @Test
    public void tEqualN2() {
        int t = 2;
        int n = 2;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(2, result);
    }

    @Test
    public void tEqualN3() {
        int t = 3;
        int n = 3;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(3, result);
    }

    @Test
    public void tEqualN4() {
        int t = 4;
        int n = 4;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(4, result);
    }

    @Test
    public void googleTest2() {
        int t = 3;
        int n = 2;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(3, result);
    }

    @Test
    public void nIs2Tis4() {
        int t = 4;
        int n = 2;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(4, result);
    }

    // x = t - n - 1 (number of required rights)
    // f(x - 2) + f(x - 1)

    /*
        R R S S S
        R S R S S
        R S S R S
        R S S S R
        R L R R S
        R S L R R
        R R S L R
        S R R L R
        S R L R R
        S S S R R
        S S R S R
        S R S S R
        R S S S R
     */

    @Test
    public void nIs3Tis5() {
        int t = 5;
        int n = 3;

        int result = MinionsBoredGame.answer(t, n);
        assertEquals(0, result);
    }

}
