package company.a.b.c.streams.TwoDecimalPlaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoDecimalPlacesTest {

    @Test
    public void Test_01() {
        assertEquals(4.66, TwoDecimalPlaces.TwoDecimalPlaces(4.659725356), 0.00);
    }

    @Test
    public void Test_02() {
        assertEquals(173735326.38, TwoDecimalPlaces.TwoDecimalPlaces(173735326.3783732637948948), 0.00);
    }
}
