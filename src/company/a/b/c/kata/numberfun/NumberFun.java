package company.a.b.c.kata.numberfun;

public class NumberFun {

    public static long findNextSquare(long sq) {
        final double sqrtOfInput = Math.sqrt(sq);
        return ((sqrtOfInput - (int) sqrtOfInput) != 0) ? -1 : (long) ((sqrtOfInput + 1) * (sqrtOfInput + 1));
    }

}

