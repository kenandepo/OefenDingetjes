package company.a.b.c.kata3.profit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.Before;

class ProfitTest {

    Random rand;

    @Before
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
        assertArrayEquals(new int[]{1,5}, Profit.minMax(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{5, 2334454}, Profit.minMax(new int[]{2334454,5}));
        assertArrayEquals(new int[]{1, 1}, Profit.minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for(int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, Profit.minMax(new int[]{r}));
        }
    }
}
