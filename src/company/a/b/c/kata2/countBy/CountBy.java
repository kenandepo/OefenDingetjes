package company.a.b.c.kata2.countBy;

public class CountBy {
    public static int[] countBy(int x, int n) {
        int input = x;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = input;
            input = input + x;
        }

        return result;

    }
}
