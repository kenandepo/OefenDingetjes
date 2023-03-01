package company.a.b.c.streams.ArrayPrinter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static String printArray(Integer array[]) {

        return Arrays.stream(array)
                .map(Object::toString)
                .collect(Collectors.joining(","));

    }
}
