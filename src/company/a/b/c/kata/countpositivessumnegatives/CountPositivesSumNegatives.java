package company.a.b.c.kata.countpositivessumnegatives;

import java.util.ArrayList;
import java.util.List;

public class CountPositivesSumNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input.length <= 0) {
            return new int[0];
        }

        final int inputLength = input.length;
        final List<Integer> positiveArray = new ArrayList();
        final List<Integer> negativeArray = new ArrayList();

        int negativeCounter = 0;
        int positiveCounter = 0;
        for (int i = 0; i < inputLength; i++) {
            if (input == null) {
                break;
            }
            if (input[i] < 0) {
                negativeCounter++;
                negativeArray.add(input[i]);
            }
            if (input[i] > 0) {
                positiveCounter++;
                positiveArray.add(input[i]);
            }

        }
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < positiveArray.size(); i++) {
            positiveSum = positiveSum + positiveArray.get(i);
        }
        for (int i = 0; i < negativeArray.size(); i++) {
            negativeSum = negativeSum + negativeArray.get(i);
        }
        return new int[] { positiveCounter, negativeSum };
    }

}