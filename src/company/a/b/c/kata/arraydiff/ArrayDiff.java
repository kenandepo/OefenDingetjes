package company.a.b.c.kata.arraydiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.yaml.snakeyaml.util.ArrayUtils;

public class ArrayDiff {
    //TODO deze werkend krijgen

    public static void arrayDiff(int[] a, int[] b) {

        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        final List listb = new ArrayList();
        for (int i = 0; i < b.length; i++) {
            listb.add(b[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.contains(listb.get(i))) {
                list.remove(listb.get(i));
            }
        }
//    return list;
    }

}
