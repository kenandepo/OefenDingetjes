package company.a.b.c.kata3;

import java.util.stream.IntStream;

public class FixingPipe {
    public static int[] pipeFix(int[] numbers) {

        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
