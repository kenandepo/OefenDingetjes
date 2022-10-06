package company.a.b.c.kata.arraydiff;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
//TODO candidate to refactor
    public static int[] arrayDiff(int[] input, int[] filter) {

        final List<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            inputList.add(input[i]);
        }

        final List<Integer> filterOutList = new ArrayList();

        for (int i = 0; i < filter.length; i++) {
            filterOutList.add(filter[i]);
        }

        final List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {
            if (!filterOutList.contains(inputList.get(i))) {
                resultList.add(inputList.get(i));

                //2 oplossingen: 1, de index bijwerken i--
                //2: nieuwe list aanmaken en vullen met resultaten
                //met waarden die niet matchen

                //convienent method Array: Arrays.toList() en andersom
            }
        }

        int[] resultArray = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

}
