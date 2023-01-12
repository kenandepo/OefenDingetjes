package company.a.b.c.kata2.mixedsum;

import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {

        if (mixed.size() < 1) {
            return 0;
        }

        int total = 0;

        for (int i = 0; i < mixed.size(); i++) {

            if (mixed.get(i) instanceof String) {
                total = total + Integer.parseInt((String) mixed.get(i));
            }
            if (mixed.get(i) instanceof Number)
                total = total + (Integer) mixed.get(i);

        }
        return total;
    }
}
