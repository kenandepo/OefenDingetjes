package company.a.b.c.kata2.powersof2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowersOfTwoTest {

    @Test
    public void testSomething() {
        assertArrayEquals(new long[] { 1 }, PowersOfTwo.powersOfTwo(0));
        assertArrayEquals(new long[] { 1, 2 }, PowersOfTwo.powersOfTwo(1));
        assertArrayEquals(new long[] { 1, 2, 4, 8, 16 }, PowersOfTwo.powersOfTwo(4));
    }
}
