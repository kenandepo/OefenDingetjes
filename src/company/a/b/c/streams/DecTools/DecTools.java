package company.a.b.c.streams.DecTools;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DecTools {

    public static int Digits(long n) {
        return String.valueOf(n)
                .length();
    }
}
