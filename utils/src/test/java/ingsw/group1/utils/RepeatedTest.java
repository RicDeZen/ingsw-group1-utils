package ingsw.group1.utils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test asserting functionality for {@link Repeat} and {@link RepeatRule}.
 *
 * @author Riccardo De Zen
 */
public class RepeatedTest {

    private static final int N = 10;
    private static int runCount = 0;
    private static int testCount = 0;
    private static boolean first = true;

    @Before
    public void reset() {
        runCount = 0;
    }

    @Rule
    public RepeatRule rule = new RepeatRule();

    @Test
    public void iShouldRunJustOnce() {
        int expected = 1;
        runCount++;
        assertEquals(expected, runCount);
    }

    @Test
    @Repeat(times = 1)
    public void iShouldRunJustOnceToo() {
        int expected = 1;
        runCount++;
        assertEquals(expected, runCount);
    }

    @Test
    @Repeat(times = N)
    public void iShouldRunMultipleTimes() {
        int firstExpected = 1;
        testCount++;
        if (first) {
            first = false;
            assertEquals(firstExpected, testCount);
        } else assertTrue(testCount > 1);
    }
}
