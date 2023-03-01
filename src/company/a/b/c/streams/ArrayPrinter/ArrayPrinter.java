package company.a.b.c.streams.ArrayPrinter;

public class ArrayPrinter {

    public static String printArray(Integer array[]) {

        String result = "";

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                result = result + array[i];
            }
            if (i != 0) {
                result = result + "," + array[i];
            }
        }
        return result;
    }
}
