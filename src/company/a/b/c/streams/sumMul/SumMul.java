package company.a.b.c.streams.sumMul;

import java.util.stream.IntStream;

public class SumMul {

    public static long sumMul(int n, int m) {

        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException();
        }
        return IntStream.range(n, m)
                .filter(i -> i % n == 0)
                .sum();
    }
}
