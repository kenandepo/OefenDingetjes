package company.a.b.c.kata.aresame;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        int subsum = 0;
        int a_multi = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                a_multi = a[i] * a[i];

                if (a_multi == b[j]) {
                    subsum++;
                }
            }
        }
        return subsum > 0;
    }
}