package company.a.b.c.kata2.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(0, Max.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        final int sequence = Max.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        assertEquals(6,sequence);
    }
}