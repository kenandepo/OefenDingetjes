package company.a.b.c.kata2.pipefix;

import java.util.Arrays;

public class PipeFix {
//todo fix me
    public static int[] pipeFix(int[] numbers) {

        Arrays.sort(numbers);

        int startNumber = numbers[0];
        int endNumber = numbers[numbers.length - 1];

        int[] resultArray = new int[endNumber - 1];

        for (int i = startNumber, j = 0; i < endNumber-1; i++, j++) {
            resultArray[j] = numbers[i - 1];
        }
        return resultArray;
    }
}