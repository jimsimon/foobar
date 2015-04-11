import com.google.challenges.BinaryBunnies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryBunniesTest {

    /*
        5
      /  \
     9    2
      \    \
       8    1

       5,9,8,2,1
       5,9,2,8,1
       5,9,2,1,8
       5,2,9,8,1
       5,2,9,1,8
       5,2,1,9,8
     */
    @Test
    public void test1() {
        int[] seq = {5, 9, 8, 2, 1};
        String result = BinaryBunnies.answer(seq);
        assertEquals("6", result);
    }

    @Test
    public void test2() {
        int[] seq = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = BinaryBunnies.answer(seq);
        assertEquals("1", result);
    }

    @Test
    public void test3() {
        int[] seq = {};
        String result = BinaryBunnies.answer(seq);
        assertEquals("1", result);
    }

    @Test
    public void test4() {
        int[] seq = {10,9,8,7,6,5,4,3,2,1};
        String result = BinaryBunnies.answer(seq);
        assertEquals("1", result);
    }


    @Test
    public void test5() {
        int[] seq = new int[50];
        for (int i=0; i<seq.length; i++) {
            seq[i] = i;
        }
        String result = BinaryBunnies.answer(seq);
        assertEquals("1", result);
    }

    @Test
    public void test6() {
        int[] seq = new int[50];
        for (int i=0; i<seq.length; i++) {
            seq[i] = seq.length - i;
        }
        String result = BinaryBunnies.answer(seq);
        assertEquals("1", result);
    }

    /*
          120
        /     \
      140    100
     /  \    / \
   150 130 110 90

    */

    @Test
    public void test7() {
        int[] seq = {120,100,140,90,110,130,150};
        String result = BinaryBunnies.answer(seq);
        assertEquals("80", result);
    }

    @Test
    public void test8() {
        int[] seq = {200,199,198,197,201,202,203};
        String result = BinaryBunnies.answer(seq);
        assertEquals("20", result);
    }

    @Test
    public void test9() {
        int[] seq = {10, -1, -20, 405, -8, -4, 52};
        String result = BinaryBunnies.answer(seq);
        assertEquals("15", result);
    }
}
