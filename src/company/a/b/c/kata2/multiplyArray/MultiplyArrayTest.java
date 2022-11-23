package company.a.b.c.kata2.multiplyArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyArrayTest {

    @Test
    public void testSomething() {
        assertEquals(6, MultiplyArray.grow(new int[] { 1, 2, 3 }));
        assertEquals(16, MultiplyArray.grow(new int[] { 4, 1, 1, 1, 4 }));
        assertEquals(64, MultiplyArray.grow(new int[] { 2, 2, 2, 2, 2, 2 }));
    }
}