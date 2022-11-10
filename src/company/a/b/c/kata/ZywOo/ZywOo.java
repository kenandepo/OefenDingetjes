package company.a.b.c.kata.ZywOo;

public class ZywOo {

    public static int[] take(int[] arr, int n) {
        if (n == 0 || arr.length == 0 || arr.length == n) {
            return new int[0];
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
