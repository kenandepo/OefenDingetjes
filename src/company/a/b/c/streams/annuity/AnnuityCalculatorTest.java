package company.a.b.c.streams.annuity;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class AnnuityCalculatorTest {

    @Test
    void testAnnuity() {
        final BigDecimal result = AnnuityCalculator.calculatAnnuity(BigDecimal.valueOf(300000), BigDecimal.valueOf(2.8));
    assertEquals(BigDecimal.valueOf(0.028),result);
    }
}
