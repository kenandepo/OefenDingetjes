package company.a.b.c.kata.oddoreven;
//Task:
//        Given a list of integers, determine whether the sum of its elements is odd or even.
//
//        Give your answer as a string matching "odd" or "even".
//
//        If the input array is empty consider it as: [0] (array with a zero).
//
//        Examples:
//        Input: [0]
//        Output: "even"
//
//        Input: [0, 1, 4]
//        Output: "odd"
//
//        Input: [0, -1, -5]
//        Output: "even"
public class OddOrEven {

    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }
//static String oddOrEven(final int[] array) {
    //        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    //    }
}
