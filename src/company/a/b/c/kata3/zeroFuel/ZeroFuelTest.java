package company.a.b.c.kata3.zeroFuel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeroFuelTest {

    @Test
    public void testFalse() {
        assertFalse(ZeroFuel.zeroFuel(100, 50, 1));
    }
    @Test
    public void testTrue() {
        assertTrue(ZeroFuel.zeroFuel(50, 25, 2));
    }
}
