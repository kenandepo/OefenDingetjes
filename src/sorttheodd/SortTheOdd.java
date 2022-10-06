package sorttheodd;

import java.util.ArrayList;
import java.util.List;

public class SortTheOdd {

    //TODO spends some more time to solve this

    public static int[] sortArray(int[] array) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (isNumberOdd(array[i])) {
                integerList.add(array[i]);
            }
        }
return null;
    }

    private static boolean isNumberOdd(int input) {
        return input % 2 == 0;
    }
}