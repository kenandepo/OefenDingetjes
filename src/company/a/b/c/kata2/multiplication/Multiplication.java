package company.a.b.c.kata2.multiplication;

public class Multiplication {
    public static int[][] multiplicationTable(int n) {

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = (i + 1) * (j + 1);
            }
        }

        return array;
    }

}
