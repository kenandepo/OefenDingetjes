package company.a.b.c.streams.validateUsr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZywOoTest {

    @Test
    public void basicTests() {
        assertEquals(true, ZywOo.validateUsr("regex"));
        assertEquals(false, ZywOo.validateUsr("a"));
        assertEquals(false, ZywOo.validateUsr("Hass"));
        assertEquals(false, ZywOo.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        assertEquals(false, ZywOo.validateUsr(""));
        assertEquals(true, ZywOo.validateUsr("____"));
        assertEquals(false, ZywOo.validateUsr("012"));
        assertEquals(true, ZywOo.validateUsr("p1pp1"));
        assertEquals(false, ZywOo.validateUsr("asd43 34"));
        assertEquals(true, ZywOo.validateUsr("asd43_34"));
    }
}
