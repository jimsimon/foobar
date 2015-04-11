import com.google.challenges.StringCleaning;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StringCleaningTest {

    @Test
    public void test0() {
        String chunk = "lolol";
        String word = "lol";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("lo", result);
    }

    @Test
    public void test1() {
        String chunk = "lololololo";
        String word = "lol";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("looo", result);
    }


    @Test
    public void test2() {
        String chunk = "goodgooogoogfogoood";
        String word = "goo";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("dogfood", result);
    }

    @Test
    public void test3() {
        String chunk = "bbbbb";
        String word = "b";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("", result);
    }

    @Test
    public void test4() {
        String chunk = "loolloooo";
        String word = "loo";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("", result);
    }

    @Test
    public void test5() {
        String chunk = "llolooollll";
        String word = "ol";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("lll", result);
    }

    @Test
    public void test6() {
        String chunk = "cacabcabbcabb";
        String word = "cab";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("b", result);
    }

    @Test
    public void test7() {
        String chunk = "";
        String word = "";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("", result);
    }

    @Test
    public void test8() {
        String chunk = "hlolollllololello";
        String word = "lol";

        String result = StringCleaning.answer(chunk, word);

        assertEquals("hello", result);
    }

//    @Test
//    public void super_test() {
//        int count = 0;
//        while(count < 100) {
//            String originalWord = "hello";
//            String addedWord = "lol";
//            Random random = new Random();
//            int repeats = random.nextInt(10);
//            String currentWord = originalWord;
//            for (int i = 0; i < repeats; i++) {
//                if (currentWord.length() + 3 >= 20) {
//                    break;
//                }
//                int insertIndex = random.nextInt(currentWord.length() - 3);
//                currentWord = currentWord.substring(0, insertIndex) + addedWord + currentWord.substring(insertIndex, currentWord.length());
//            }
//
//            String result = StringCleaning.answer(currentWord, addedWord);
//
//            assertEquals("String failed: "+currentWord, originalWord, result);
//            count++;
//        }
//    }

//    @Test
//    public void test8() {
//        String chunk = "";
//        String word = "";
//
//        String result = StringCleaning.answer(chunk, word);
//
//        assertEquals("", result);
//    }
}
