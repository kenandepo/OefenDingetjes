package company.a.b.c.kata2.multiplyArray;

public class MultiplyArray {

    public static int grow(int[] x) {
        int total = x[0];

        for (int i = 1; i < x.length; i++) {

            int sum = x[i];
            total = total * sum;
        }
        return total;
    }

}