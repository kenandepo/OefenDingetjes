package company.a.b.c.kata.smallenough;

import java.util.Arrays;

public class SmallEnough {

    public static boolean smallEnough(int[] a, int limit) {

        return Arrays.stream(a)
                .filter(element -> element <= limit)
                .count() == a.length;
    }
}