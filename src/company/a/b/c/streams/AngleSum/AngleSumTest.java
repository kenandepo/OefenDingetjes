package company.a.b.c.streams.AngleSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AngleSumTest {
    @Test
    public void sampleTests() {
        assertEquals(180, AngleSum.sumOfAngles(3));
        assertEquals(360, AngleSum.sumOfAngles(4));
        assertEquals(540,AngleSum.sumOfAngles(5));
        assertEquals(720,AngleSum.sumOfAngles(6));
        assertEquals(900,AngleSum.sumOfAngles(7));
    }
}


