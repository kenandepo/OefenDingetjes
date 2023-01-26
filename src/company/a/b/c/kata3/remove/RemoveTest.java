package company.a.b.c.kata3.remove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", Remove.remove("eloquent"));
        assertEquals("ountr", Remove.remove("country"));
        assertEquals("erso", Remove.remove("person"));
        assertEquals("lac", Remove.remove("place"));
    }
}

