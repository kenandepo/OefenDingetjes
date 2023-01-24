package company.a.b.c.kata2.sortArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortArrayTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortArray.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortArray.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortArray.sortArray(new int[]{}));
    }
}
