package company.a.b.c.kata3.profit;

import java.util.Arrays;

public class Profit {

    public static int[] minMax(int[] arr) {
        if (arr.length==1){
            return new int[] { arr[0] };
        }
        Arrays.sort(arr);
        return new int[] { arr[0], arr[arr.length - 1] };
    }
}
