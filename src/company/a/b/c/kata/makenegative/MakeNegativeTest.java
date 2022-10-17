package company.a.b.c.kata.makenegative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, MakeNegative.makeNegative(42));
    }
}