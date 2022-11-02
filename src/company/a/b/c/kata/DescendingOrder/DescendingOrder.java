package company.a.b.c.kata.DescendingOrder;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}