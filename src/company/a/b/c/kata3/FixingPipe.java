package company.a.b.c.kata3;

import java.util.Arrays;

public class FixingPipe {
    public static int[] pipeFix(int[] numbers) {

        //        Arrays.sort(numbers);

        int beginDigit = numbers[0];
        int endDigit = numbers[numbers.length - 1];

        int[] resultArray = new int[endDigit - beginDigit + 1];

        for (int j = beginDigit, i = 0; i + beginDigit <= endDigit; i++, j++) {
            resultArray[i] = j;
        }

        return resultArray;
    }
}
