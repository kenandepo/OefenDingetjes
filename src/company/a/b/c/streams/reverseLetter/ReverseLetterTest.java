package company.a.b.c.streams.reverseLetter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseLetterTest {

    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, ReverseLetter.reverseLetter(str));
    }
}
