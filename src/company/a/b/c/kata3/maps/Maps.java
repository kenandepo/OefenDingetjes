package company.a.b.c.kata3.maps;

import java.util.Arrays;

public class Maps {

    public static int[] map(int[] arr) {

        return Arrays.stream(arr).map(x -> x*2).toArray();

    }
}
