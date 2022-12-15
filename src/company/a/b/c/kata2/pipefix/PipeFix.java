package company.a.b.c.kata2.pipefix;

import java.util.Arrays;

public class PipeFix {

    public static int[] pipeFix(int[] numbers) {
        Arrays.sort(numbers);

        int lowest = numbers[0];
        int highest = numbers[numbers.length - 1];

        int[] resultArray = new int[highest - lowest + 1];

        for (int index = 0; index + lowest <= highest; index++) {
            resultArray[index] = index + lowest;
        }

        return resultArray;
    }
}