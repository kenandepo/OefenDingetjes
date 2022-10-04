package company.a.b.c.kata.squareSum;

public class SquareSum {

    public static int squareSum(int[] n) {
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i] * n[i];
        }
        return sum;
    }
}