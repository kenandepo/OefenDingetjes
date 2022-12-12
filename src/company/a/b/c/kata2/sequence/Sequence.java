package company.a.b.c.kata2.sequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sequence {
    public static int[] reverse(int n) {
        int[] inputArray = new int[n];

        for (int i = 0, j = 1; i < n; i++, j++) {
            inputArray[i] = j;
        }
        int[] resultArray = new int[n];

        for (int i = 0, j = 4; i < n; i++, j--) {
            resultArray[i] = inputArray[j];
        }
        return resultArray;
    }
}