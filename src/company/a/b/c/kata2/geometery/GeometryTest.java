package company.a.b.c.kata2.geometery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {
    @Test
    public void FixedTests() {
        assertEquals(86, Geometry.predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, Geometry.predictAge(32,54,76,65,34,63,64,45));
    }
}
