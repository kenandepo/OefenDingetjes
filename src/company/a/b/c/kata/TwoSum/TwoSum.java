package company.a.b.c.kata.TwoSum;

public class TwoSum {
    //todo finish this
    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { numbers[i], numbers[j] };
                }
            }
        }
        return null;
    }

}
