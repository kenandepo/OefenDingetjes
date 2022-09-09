package company.a.b.c.bankingkata;

public class Iverse {

    public static int[] invert(int[] array) {

        int[] averse = new int[array.length];

        for (int i = 0; i < array.length; i++) {

                String arrayValue = "-" + array[i];

            final String s = String.valueOf(array[i]);
            
            averse[i] = Integer.parseInt(arrayValue);
            }
        return averse;
    }
}
