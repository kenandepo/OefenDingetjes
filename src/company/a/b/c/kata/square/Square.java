package company.a.b.c.kata.square;

public class Square {

    public static boolean isSquare(int n) {
        final int sqrt = (int) Math.sqrt(n);
        return sqrt*sqrt==n;
    }
}