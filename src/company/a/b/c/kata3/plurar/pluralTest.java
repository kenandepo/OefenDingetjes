package company.a.b.c.kata3.plurar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pluralTest {
    @Test
    public void BasicTest() {
        assertEquals(true, plural.isPlural(0f));
        assertEquals(true, plural.isPlural(0.5f));
        assertEquals(false, plural.isPlural(1f));
        assertEquals(true, plural.isPlural(100f));
    }

}
