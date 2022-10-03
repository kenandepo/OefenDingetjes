package company.a.b.c.kata.factor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorsTest {

    @Test
    public void basicTests() {
        assertEquals(true, Factors.checkForFactor(10, 2));
        assertEquals(true, Factors.checkForFactor(63, 7));
        assertEquals(true, Factors.checkForFactor(2450, 5));
        assertEquals(true, Factors.checkForFactor(24612, 3));
    }
}