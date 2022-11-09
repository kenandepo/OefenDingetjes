package company.a.b.c.kata.jadencase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToJadenCaseTest {

    ToJadenCase jadenCase = new ToJadenCase();

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull(null, jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull(null, jadenCase.toJadenCase(""));
    }

}
