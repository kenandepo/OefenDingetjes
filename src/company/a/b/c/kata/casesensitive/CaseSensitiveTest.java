package company.a.b.c.kata.casesensitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseSensitiveTest {

    @Test
    void sampleTest() {
        assertEquals("SSttrriinngg", CaseSensitive.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd", CaseSensitive.doubleChar("Hello World"));
        assertEquals("11223344!!__  ", CaseSensitive.doubleChar("1234!_ "));
    }
}