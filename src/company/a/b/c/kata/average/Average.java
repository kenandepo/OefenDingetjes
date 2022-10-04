package company.a.b.c.kata.average;

public class Average {

    public static double find_average(int[] array) {
        double i = 0;

        for (int j = 0; j < array.length; j++) {
            i = i + array[j];
        }

        return i / array.length;
    }
}