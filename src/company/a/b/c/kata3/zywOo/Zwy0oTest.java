package company.a.b.c.kata3.zywOo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Zwy0oTest {
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}
