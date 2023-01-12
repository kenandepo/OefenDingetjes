package company.a.b.c.kata2.powersof2;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {

        if (n == 0) {
            n = 1;
        }

        long temp = n;

        long[] longArray = new long[n];

        for (int i = 1, j = 0; i < n + 1; i++, j++) {
            temp = (temp * i);
            longArray[j] = temp;
        }

        return longArray;
    }
}
