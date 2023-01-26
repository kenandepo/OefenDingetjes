package company.a.b.c.kata3.isSortedAndHow;

public class IsSortedAndHow {

    public static String isSortedAndHow(int[] array) {

        final String descending = "yes, descending";
        final String ascending = "yes, ascending";
        final String otherwise = "no";

        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[i + 1]) {
                return ascending;
            }

        }
        return otherwise;
    }
}
