package company.a.b.c.kata2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> integerList = new ArrayList<>();
        List<Integer> comparisonList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            integerList.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            comparisonList.add(b[i]);
        }
        integerList.removeAll(comparisonList);

        int[] result = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            result[i] = integerList.get(i);
        }
        return result;

    }

}