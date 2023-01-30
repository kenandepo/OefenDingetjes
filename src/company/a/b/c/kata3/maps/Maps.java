package company.a.b.c.kata3.maps;

public class Maps {

    public static int[] map(int[] arr) {

        int[] resultArray = new int[arr.length];

        for (int i = 0; i < resultArray.length; i++) {

            resultArray[i] = arr[i] * 2;
        }
        return resultArray;
    }
}
