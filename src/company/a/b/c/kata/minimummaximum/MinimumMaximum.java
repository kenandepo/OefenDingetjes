package company.a.b.c.kata.minimummaximum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumMaximum {

    public int min(int[] list) {
        final List<Integer> sortedList = getSortedList(list);
        return sortedList.get(0);
    }

    public int max(int[] list) {
        final List<Integer> sortedList = getSortedList(list);
        return sortedList.get(sortedList.size() - 1);
    }

    List<Integer> getSortedList(int[] list) {
        final List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            arrayList.add(list[i]);
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
