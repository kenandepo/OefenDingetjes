package company.a.b.c.streams.bob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BobTest {

    @Test
    public void testBob() {
        assertEquals(0, Bob.enough(10, 5, 5));
        assertEquals(10, Bob.enough(100, 60, 50));
        assertEquals(0, Bob.enough(20, 5, 5));
    }
}
