package company.a.b.c.streams.WideMouthedFrog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WideMouthedFrogTest {

    @Test
    public void fixedTests() {
        assertEquals("wide", WideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide",WideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", WideMouthedFrog.mouthSize("alligator"));
    }
}
