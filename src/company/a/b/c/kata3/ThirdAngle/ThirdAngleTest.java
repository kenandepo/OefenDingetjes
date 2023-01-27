package company.a.b.c.kata3.ThirdAngle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThirdAngleTest {

    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngle.otherAngle(45,12));
        assertEquals(70, ThirdAngle.otherAngle(50,60));
    }
}
