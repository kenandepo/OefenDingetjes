package company.a.b.c.kata3.DataReverse;

public class DataReverse {
    public static int[] DataReverse(int[] data) {

        int bytes[] = new int[data.length];
        for (int i = data.length - 8, j = 0; i >= 0; i -= 8, j += 8) {
            System.arraycopy(data, i, bytes, j, 8);
        }
        return bytes;
    }
}
