package company.a.b.c.kata3.CodeWars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodeWarsTest {

    @Test
    public void testSomething() {
        assertEquals(1, CodeWars.strCount("Hello", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("",'z'));
    }
}
