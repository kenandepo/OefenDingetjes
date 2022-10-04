package company.a.b.c.kata.twiceasold;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears) {

        final int doubleSonYears = sonYears + sonYears;
        final int i = dadYears - doubleSonYears;

        if (i <= 0) {
            return doubleSonYears - dadYears;
        } else {
            return i;
        }
    }

}