package company.a.b.c.kata.firstnonconsecutive;

public class FirstNonConsecutive {

    static Integer find(final int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (i > 0 && i < array.length) {

                if (array[i] - array[i - 1] != 1) {
                    return array[i];
                }
            }
        }
        return null;
    }

}


