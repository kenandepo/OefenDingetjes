package company.a.b.c.kata.findtheodd;

public class FindOdd {

    public static int findIt(int[] inputArray) {

        int hits = 0;
//todo
        for (int i = 0; i < inputArray.length; i++) {
            int numberToCheck = inputArray[i];

            for (int j = 0; j < inputArray.length; j++) {

                if (numberToCheck == inputArray[j]) {
                    hits++;
                }
            }
        }
        return 0;
    }
}