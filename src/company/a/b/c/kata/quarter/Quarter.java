package company.a.b.c.kata.quarter;

public class Quarter {

    public static int quarterOf(int month) {

        return month <= 3 ? 1 : month <= 6 ? 2 : month <= 9 ? 3 : 4;

    }
}