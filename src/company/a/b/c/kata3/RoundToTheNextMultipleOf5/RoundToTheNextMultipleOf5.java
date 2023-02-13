package company.a.b.c.kata3.RoundToTheNextMultipleOf5;

public class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {
        if (number == 5)
            return 5;

        return number == 0 ? 0 : Math.round((number / 5 + 1) * 10);

    }
}
