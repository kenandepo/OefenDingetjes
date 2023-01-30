package company.a.b.c.kata3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FixingPipeTest {

    @Test
    public void test2() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, FixingPipe.pipeFix(new int[] { 1, 2, 3, 12 }));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[] { 6, 7, 8, 9 }, FixingPipe.pipeFix(new int[] { 6, 9 }));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[] { -1, 0, 1, 2, 3, 4 }, FixingPipe.pipeFix(new int[] { -1, 4 }));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[] { 1, 2, 3 }, FixingPipe.pipeFix(new int[] { 1, 2, 3 }));
    }
}
