package company.a.b.c.kata2.sum;

public class Max {

    public static int sequence(int[] arr) {

        int inst = 0, max = 0;

        for (int i : arr) {
            inst = Math.max(0, inst + i);
            max = Math.max(max, inst);
        }
        return max;
    }
}