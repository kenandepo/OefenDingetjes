package company.a.b.c.kata2.opposite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class oppositeTest {

    @Test
    public void tests() {
        assertEquals(-1, opposite.opposite(1));
    }
}