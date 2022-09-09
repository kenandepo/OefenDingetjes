package company.a.b.c.kata.minmax;

import java.util.Arrays;

public class MinMax {

    //    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    //
    //            Examples
    //    highAndLow("1 2 3 4 5")  // return "5 1"
    //    highAndLow("1 2 -3 4 5") // return "5 -3"
    //    highAndLow("1 9 3 4 -5") // return "9 -5"
    //    Notes
    //    All numbers are valid Int32, no need to validate them.
    //    There will always be at least one number in the input string.
    //    Output string must be two numbers separated by a single space, and highest number is first.
    public static void main(String[] args) {
        final String s = highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println(s);
    }

    public static String highAndLow(String numbers) {
        final String[] strings = numbers.trim()
                .split(" ");
        int[] ints = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        //leerpunt: ik deed een sort op de String[], maar dat moest op de int[]
        Arrays.sort(ints);
        return ints[ints.length - 1] + " " + ints[0];
    }
}