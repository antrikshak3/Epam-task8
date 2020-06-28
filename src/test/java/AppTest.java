

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class AppTest
{
    /**
     * Rigorous Test :-)
     * 1. AB => B
     * 2. BACD => BCD
     * 3. A =>
     * 4. AACA => CA
     * 5. BCAA => BCAA
     * 6. " " => " "
     */

    RemoveFirstTwoA removeFirstTwoA;

    @BeforeEach
    public void setUp() {
        removeFirstTwoA = new RemoveFirstTwoA();
    }

    @Test
    public void test1Case() {
        String actual = removeFirstTwoA.removeA("AB");
        assertEquals("B", actual);
    }

    @Test
    public void test2Case() {
        String actual = removeFirstTwoA.removeA("BACD");
        assertEquals("BCD", actual);
    }

    @Test
    public void test3Case() {
        String actual = removeFirstTwoA.removeA("A");
        assertEquals("", actual);
    }

    @Test
    public void test4Case() {
        String actual = removeFirstTwoA.removeA("AACA");
        assertEquals("CA", actual);
    }

    @Test
    public void test5Case() {
        String actual = removeFirstTwoA.removeA("BCAA");
        assertEquals("BCAA", actual);
    }

    @Test
    public void test6Case() {
        String actual = removeFirstTwoA.removeA("");
        assertEquals("", actual);
    }
}
