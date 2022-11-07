package company.a.b.c.kata.whatisinbetween;

public class WhatIsInBetween {

    public static int[] between(int a, int b) {
        int lenghtOfArray = b - a + 1;

        int[] intArray = new int[lenghtOfArray];

        for (int i = 0, j = a; i < lenghtOfArray; i++, j++) {
            intArray[i] = j;
        }
        return intArray;
    }
}