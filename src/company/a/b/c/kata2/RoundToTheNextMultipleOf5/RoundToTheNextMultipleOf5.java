package company.a.b.c.kata2.RoundToTheNextMultipleOf5;

public class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {

        return Math.round((number / 5 + 1) * 10);

    }
}
