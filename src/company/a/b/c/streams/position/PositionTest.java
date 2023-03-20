package company.a.b.c.streams.position;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Position.position('a'));
        assertEquals("Position of alphabet: 26", Position.position('z'));
        assertEquals("Position of alphabet: 5", Position.position('e'));
    }
}
