package company.a.b.c.kata2.fixcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FixCaseTest {

    @Test
    public void BasicTests() {
        assertEquals("code", FixCase.solve("code"));
        assertEquals("CODE", FixCase.solve("CODe"));
        assertEquals("code", FixCase.solve("COde"));
        assertEquals("code", FixCase.solve("Code"));
        assertEquals("", FixCase.solve(""));
    }
}
