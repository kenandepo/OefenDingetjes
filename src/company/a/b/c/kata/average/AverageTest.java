package company.a.b.c.kata.average;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Average.find_average(new int[] { 1, 1, 1 }), DELTA);
        assertEquals(2, Average.find_average(new int[] { 1, 2, 3 }), DELTA);
    }
}