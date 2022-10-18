package company.a.b.c.kata.digitize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DigitizeTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[] { 1, 3, 2, 5, 3 }, Digitize.digitize(35231));
//        assertArrayEquals(new int[] { 0 }, Digitize.digitize(0));
    }
}