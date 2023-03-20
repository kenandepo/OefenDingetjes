package company.a.b.c.streams.annuity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AnnuityCalculator {

    public static BigDecimal calculatAnnuity(final BigDecimal marketValueAmount, final BigDecimal interestRatePercentage) {
        final BigDecimal EenPLusRente = BigDecimal.valueOf(1)
                .add(interestRatePercentage)
                .pow(1 / 12);

        final BigDecimal renteTotdemin12 = EenPLusRente.pow(-12);

        final BigDecimal heleONderSteRegel = BigDecimal.valueOf(1)
                .min(renteTotdemin12);
        final BigDecimal rente = interestRatePercentage.divide(heleONderSteRegel);

        return marketValueAmount.multiply(rente);
    }

}
