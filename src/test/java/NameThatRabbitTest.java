import com.google.challenges.NameThatRabbit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameThatRabbitTest {

    @Test
    public void test1() {
        String[] input = {"annie", "bonnie", "liz"};
        String[] result = NameThatRabbit.answer(input);
        assertEquals("bonnie", result[0]);
        assertEquals("liz", result[1]);
        assertEquals("annie", result[2]);
    }

    @Test
    public void test2() {
        String[] input = {"abcdefg", "vi"};
        String[] result = NameThatRabbit.answer(input);
        assertEquals("vi", result[0]);
        assertEquals("abcdefg", result[1]);
    }

    @Test
    public void test3() {
        String[] input = {"al", "cj"};
        String[] result = NameThatRabbit.answer(input);
        assertEquals("cj", result[0]);
        assertEquals("al", result[1]);
    }
}
