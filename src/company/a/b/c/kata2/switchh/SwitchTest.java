package company.a.b.c.kata2.switchh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchTest {

    @Test
    public void basicTests() {
        assertEquals("One", Switch.switchItUp(1));
        assertEquals("Three", Switch.switchItUp(3));
        assertEquals("Five", Switch.switchItUp(5));
    }
}