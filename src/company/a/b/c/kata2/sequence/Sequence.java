package company.a.b.c.kata2.sequence;


public class Sequence {
    public static int[] reverse(int n) {

        int[] inputArray = new int[n];

        for (int i = n, j = 0; j < n; i--, j++) {
            inputArray[j] = i;
        }
        return inputArray;
    }
}