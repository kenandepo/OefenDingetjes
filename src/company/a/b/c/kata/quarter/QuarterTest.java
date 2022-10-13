package company.a.b.c.kata.quarter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuarterTest {

    @Test
    public void exampleTests() {
        assertEquals(1, Quarter.quarterOf(3));
        assertEquals(3, Quarter.quarterOf(8));
        assertEquals(4, Quarter.quarterOf(11));
    }
}