package company.a.b.c.kata.makenegative;

public class MakeNegative {

    public static int makeNegative(final int x) {
        return x < 0 ? x : Integer.valueOf("-" + x);
    }

}