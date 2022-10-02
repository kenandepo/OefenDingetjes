package company.a.b.c.kata.reversestring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReversedStringTest {

    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedString.solution("world"));
    }

}